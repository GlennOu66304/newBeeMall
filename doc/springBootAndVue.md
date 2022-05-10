



# [Mybatis - Invalid bound statement (not found)](https://stackoverflow.com/questions/55000770/mybatis-invalid-bound-statement-not-found)

Way1

```java
@MapperScan("com.jjs.videoservice.dao") 
```



Way2

Check the mapper in the resource folder

```
检查mapping文件
```

[Invalid bound statement (not found) 解决思路](https://blog.csdn.net/qq_27818541/article/details/107236404)

# [Description: Field ud in com.yjj.service.impl.UserServiceImpl required a bean of type 'com.yjj.dao.UserDao' that could not be found. Action: Consider defining a bean of type 'com.yjj.dao.UserDao'](https://www.cnblogs.com/leafarmyarmy/p/10564509.html)

```java
`@ComponentScan(basePackages = {"com.yjj.dao","com.yjj.service","com.yjj.controller"})
```



# Or filled the file in the service impl

## Login update account log out:

1.login get the token(get the token)

2.change the user information(send the token to the server and verify the token)

3.log out the user information(delete the token)



## Process

Model --> View -->

1. 1.api
2. 1.paramas

2.api:routes, overview controller

3.service handle the specific controller

# [8080 port already taken issue when trying to redeploy project from Spring Tool Suite IDE](https://stackoverflow.com/questions/40118878/8080-port-already-taken-issue-when-trying-to-redeploy-project-from-spring-tool-s)

```
sudo lsof -i tcp:8080

kill -15 PID (PID number)
```



## install the Lombok plugin

1.confirm the 

IDEA version: (Runtime version: 11.0.14.1+1-b1751.46 x86_64)2021.3.3

and Lombok version:

2. 2.install the plugin from the IDEA Plugin Market or from the local enviroment;
3. 3.Solution:
4. Choose the IDEA version:2020.2.4 
5. [Version 2020.2](https://www.jetbrains.com/idea/download/other.html)
6. And lombok version:[0.34-2020.2](https://plugins.jetbrains.com/plugin/6317-lombok/versions/stable/107975)
7. [Lombok](https://plugins.jetbrains.com/plugin/6317-lombok/versions)

[Setting up Lombok with Eclipse and Intellij](https://www.baeldung.com/lombok-ide)

4.When you see the err, you can right click then add the maven package, after that. You need to restart the IDEA to see the effect.

## Login API section

1.Login API build

2.TEST it in the Swagger

3.download the section of the code in the baidu drive to test it

##Process

1.Control

2.Router

3.Swagger Test

## 0.Project Start:

1.follow the tutorial finish the project

2.set up the initial starter to build the project

3.Read the code: 

3.1 paste the code into the 



1.build the reading note for every section as md file(import from the simple read)

2.put it under the doc folder

3.folder in the java is the package, file in the folder is the class

## Process

1.follow the tutorila to build the project

1.1 git commit, every submit the project Leaning repo and source code repo

1.2 git hub project build host the source code

1.3 move the downoad the project to top right



##1 [Vue 商城项目开发实战](https://juejin.cn/book/6844733826191589390/section)(Vue3)



1.1 SpringBoot Learning

**1.2 Back End buid**

1.2.1 Starter Project Build

1.2.2 API build

1.2.2.1Model(entity User) --->Controller(CRUD:api folder) -->Routes(api folder) --->Swagger Test(config> Swagger2Config)

1.2.2.2Routes(CRUD): (api folder )

C:@PostMapping("/users") POST



R:@GetMapping("/users") GET & @PutMapping("/users/{id}")



U:@PutMapping("/users/{id}") UPDATE

D:@DeleteMapping("/users/{id}") DELETE



1.2.2.3 Other folder check:

Common: regular used common varible

DAO folder:Api request ----> resource ---> Mapper --> DAO.xml to process the sql query

Service folder:Something Else: implies ---> Service file

Util:Tools MD5 Package

Api:-->params-->Vo-->API

Application.properties:Data base connect

[主体目录结构如下：](https://juejin.cn/book/6844733826191589390/section/6844733826279669774)



1.2.3  Login API build

1.2.4 Home Page API

1.2.5 Category API

1.2.6 ShopItem Search API

1.2.7 Shopping Cart API

1.2.8 Order generate API

1.2.9 Order Payment, Details,List API

1.



**1.3 Front End Build**

1.3.1Nav Bar

1.3.2 register and login

1.3.3 Home Page Build

1.3.4 etc...

**1.4 Front End and Back End integrate together**

**1.5 Source Code Demo Project Build:**

1.5.1 API start: (only can view the Swagger API )

a. back end code start

b. Data base start

c. test the api with post man or Swagger

```bash
git clone https://github.com/newbee-ltd/newbee-mall-api.git
```



1.5.2 Admn System start(CRM Vue):API + Front end two in one

```
git clone https://github.com/newbee-ltd/newbee-mall-manage.git
```



1.5.3 Client Site Start(Ecormance Sites) No this project, need to build this project with the API given



## UI and Demo image

1. 1. 1.it is a H5 page in the front end
   2. 2.Front EndDemo image:
   3. [Vue3 Shop](http://47.99.134.126:5008/#/home)
   4. 2.1 Back end Swagger Testing:
   5. [新蜂商城接口文档](http://backend-api-01.newbee.ltd/swagger-ui.html)

3.Source Code

Front End:**[newbee-mall-vue3-app](https://github.com/newbee-ltd/newbee-mall-vue3-app)**

Back End: [newbee-mall-api](https://github.com/newbee-ltd/newbee-mall-api)



## Learning Tips

When you finish an API, then build the this part of the UI Page in the front End

