

# Java Spring Boot Project 

## Spring 后端项目启动（Spring API + Vue Front)
[Spring 后端项目启动（Spring API + Vue Front)](https://juejin.cn/book/6844733826191589390/section/6844733826279669774)

When you first start the project, make sure you change the database username and 

password in the file:application.properties

## Swagger Spring API - xmlModelPlugin Error
change the jdk and project sdk to java 1.8
[Swagger Spring API - xmlModelPlugin Error](https://stackoverflow.com/questions/48622921/swagger-spring-api-xmlmodelplugin-error)

## install jdk 8
```
brew install openjdk@8
```
[How to install Java JDK on macOS](https://mkyong.com/java/how-to-install-java-on-mac-osx/)   

[How to install Java 8 on Mac](https://stackoverflow.com/questions/24342886/how-to-install-java-8-on-mac?rq=1)   

## How to change the IntelliJ IDEA JDK version?
[How to change the IntelliJ IDEA JDK version?](https://mkyong.com/intellij/how-to-change-the-intellij-idea-jdk-version/)   

[How to Change the Java Version in an IntelliJ Project](https://www.baeldung.com/intellij-change-java-version)   


## install the maven on mac
[How to Install Maven on Mac OS](https://www.journaldev.com/2348/install-maven-mac-os)

[Installing Apache Maven](http://maven.apache.org/install.html)  
## Can not find the spring inital in idea

You can only see this option Idea UT version, and you can not see it in the Idea CE version.
With the CE version, you need to build the project from the link below, then import it to the idea ce version, and do not forget to choose the web indepency or the project will create the bug

https://start.spring.io/
[ntellij Spring Initializr not available](https://stackoverflow.com/questions/32476228/intellij-spring-initializr-not-available)  

## No JDK specified for module ERROR MESSAGE
[No JDK specified for module ERROR MESSAGE](https://intellij-support.jetbrains.com/hc/en-us/community/posts/206939815-No-JDK-specified-for-module-ERROR-MESSAGE)  

## How do I edit $PATH (.bash_profile) on OS X?
[How do I edit $PATH (.bash_profile) on OS X?](https://stackoverflow.com/questions/30461201/how-do-i-edit-path-bash-profile-on-os-x)  

## Unknown lifecycle phase “spring-boot”

Make sure you run no space between mvn spring-boot: and run
```
mvn spring-boot:run
```
[Unknown lifecycle phase “spring-boot”](https://stackoverflow.com/questions/43923687/unknown-lifecycle-phase-spring-boot)
  
## 报错 No active profile set, falling back to default profiles: default 解决
add the code below to the pom file
```
<dependency>
<groupId>org-springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>

```
[报错 No active profile set, falling back to default profiles: default 解决](https://blog.csdn.net/qq_36652619/article/details/103197523)  

## Can not run the @enableswagger in config package.always alert the red warning

After you add the dependency to the poml file, you need to sync the poml, make sure the 
project loads this maven package, then when you head to the config, write the swagger2Config.java will not alert the red warning


## Can not load the swagger complete page
You need to go to the config package and locate the swagger2Config.java, change the controller package as below:
```
.apis(RequestHandlerSelectors.basePackage("ltd.newbee.mall.newbeemall.controller"))

```

## entity red warning

You need to build the entity package and change the path as below:
TestSwaggerController.java
```
import ltd.newbee.mall.newbeemall.entity.User;

```

[SpringBoot 集成接口文档工具 swagger](https://www.bilibili.com/video/BV1th411y7Th/?spm_id_from=333.788.recommend_more_video.13)  
[Spring Boot 项目中集成 Swagger。](https://juejin.cn/book/6844733826191589390/section/6844733826288058382)  

## Package and class

Package is a folder and class is a java file in springboot project

## REFERENCE
[新蜂商城升级为 Spring Boot + Vue ](https://juejin.cn/book/6844733826191589390/section/6844733826229338126)   
