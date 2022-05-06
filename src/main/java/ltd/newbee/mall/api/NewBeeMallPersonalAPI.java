/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2020 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import ltd.newbee.mall.api.param.MallUserLoginParam;
import ltd.newbee.mall.api.param.MallUserUpdateParam;
import ltd.newbee.mall.common.Constants;
import ltd.newbee.mall.config.annotation.TokenToMallUser;
import ltd.newbee.mall.entity.MallUser;
import ltd.newbee.mall.service.NewBeeMallUserService;
import ltd.newbee.mall.util.BeanUtil;
import ltd.newbee.mall.util.Result;
import ltd.newbee.mall.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import ltd.newbee.mall.api.vo.NewBeeMallUserVO;
import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(value = "v1", tags = "新蜂商城用户操作相关接口")
//routes starter
@RequestMapping("/api/v1")

//controller
public class NewBeeMallPersonalAPI {

    @Resource
    private NewBeeMallUserService newBeeMallUserService;

    private static final Logger logger = LoggerFactory.getLogger(NewBeeMallPersonalAPI.class);
//login routes
    @PostMapping("/user/login")
//   swagger informatin
    @ApiOperation(value = "登录接口", notes = "返回token")
//    function
    public Result<String> login(@RequestBody @Valid MallUserLoginParam mallUserLoginParam) {
        String loginResult = newBeeMallUserService.login(mallUserLoginParam.getLoginName(), mallUserLoginParam.getPasswordMd5());

        logger.info("login api,loginName={},loginResult={}", mallUserLoginParam.getLoginName(), loginResult);

        //登录成功
        if (!StringUtils.isEmpty(loginResult) && loginResult.length() == Constants.TOKEN_LENGTH) {
            Result result = ResultGenerator.genSuccessResult();
            result.setData(loginResult);
            return result;
        }
        //登录失败
        return ResultGenerator.genFailResult(loginResult);
    }
//    testing router
    @GetMapping(value = "/test1")
    @ApiOperation(value = "测试接口", notes = "方法中含有@TokenToMallUser注解")
    public Result<String> test1(@TokenToMallUser MallUser user) {
        //此接口含有@TokenToMallUser注解，即需要登陆验证的接口。
        Result result = null;
        if (user == null) {
            //如果通过请求header中的token未查询到用户的话即token无效，登陆验证失败，返回未登录错误码。
            result = ResultGenerator.genErrorResult(416, "未登录！");
            return result;
        } else {
            //登陆验证通过。
            result = ResultGenerator.genSuccessResult("登陆验证通过");
        }
        return result;
    }

    @GetMapping(value = "/test2")
    @ApiOperation(value = "测试接口", notes = "方法中无@TokenToMallUser注解")
    public Result<String> test2() {
        //此接口不含@TokenToMallUser注解，即访问此接口无需登陆验证，此类接口在实际开发中应该很少，为了安全起见应该所有接口都会做登陆验证。
        Result result = ResultGenerator.genSuccessResult("此接口无需登陆验证，请求成功");
        //直接返回业务逻辑返回的数据即可。
        return result;
    }

//get user infromation
    @GetMapping("/user/info")
    @ApiOperation(value = "获取用户信息", notes = "")
    public Result<NewBeeMallUserVO> getUserDetail(@TokenToMallUser MallUser loginMallUser) {
        //已登录则直接返回
        NewBeeMallUserVO mallUserVO = new NewBeeMallUserVO();
        BeanUtil.copyProperties(loginMallUser, mallUserVO);
        return ResultGenerator.genSuccessResult(mallUserVO);
    }
//update the userInformation
    @PutMapping("/user/info")
    @ApiOperation(value = "修改用户信息", notes = "")
    public Result updateInfo(@RequestBody @ApiParam("用户信息") MallUserUpdateParam mallUserUpdateParam, @TokenToMallUser MallUser loginMallUser) {
        Boolean flag = newBeeMallUserService.updateUserInfo(mallUserUpdateParam, loginMallUser.getUserId());
        if (flag) {
            //返回成功
            Result result = ResultGenerator.genSuccessResult();
            return result;
        } else {
            //返回失败
            Result result = ResultGenerator.genFailResult("修改失败");
            return result;
        }
    }
//Logout the userinfo
    @PostMapping("/user/logout")
    @ApiOperation(value = "登出接口", notes = "清除token")
    public Result<String> logout(@TokenToMallUser MallUser loginMallUser) {
        Boolean logoutResult = newBeeMallUserService.logout(loginMallUser.getUserId());

        logger.info("logout api,loginMallUser={}", loginMallUser.getUserId());

        //登出成功
        if (logoutResult) {
            return ResultGenerator.genSuccessResult();
        }
        //登出失败
        return ResultGenerator.genFailResult("logout error");
    }
}
