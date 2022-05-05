package ltd.newbee.mall.newbeemall.controller;
import ltd.newbee.mall.newbeemall.entity.SaleGoods;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
//    routes
//    @RequestMapping("/test/type/conversion")
//    controller
//    public void typeConversionTest(String goodsName, float weight, int type, Boolean onSale) {
//        System.out.println("goodsName:" + goodsName);
//        System.out.println("weight:" + weight);
//        System.out.println("type:" + type);
//        System.out.println("onSale:" + onSale);
//    }

    // HttpMessageConverter
//    router
    @RequestMapping(value = "/test/httpmessageconverter", method = RequestMethod.POST)
//    controller
    public SaleGoods httpMessageConverterTest(@RequestBody SaleGoods saleGoods) {
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType() + 1);
        saleGoods.setGoodsName("商品名：" + saleGoods.getGoodsName());
        return saleGoods;
    }
}