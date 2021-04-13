package com.alin.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * SwaggerConfig
 *
 * @author 李钰林
 * @date 2021/4/13
 */
@Configuration
public class SwaggerConfig {
    //配置swagger的docket的bean实例
    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .enable(true)   //是否开启swagger
                .select()
                //配置需要扫描接口的包
                //RequestHandlerSelectors.any()扫描全部
                //RequestHandlerSelectors.none()不扫描
                //RequestHandlerSelectors.withclassannotation()根据注解 扫描
                //RequestHandlerSelectors.basePackage扫描包
                .apis(RequestHandlerSelectors.basePackage("com.alin.swagger.controller"))
                //过滤路径
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    //配置swagger信息 apiInfo
    private ApiInfo getApiInfo(){
        //配置作者信息
        Contact contact = new Contact("", "", "");
        return new ApiInfo(
                "阿林的api文档",//文档标题
                "api文档", //文档描述
                "1.0",  //文档版本
                "www.baidu.com",
                contact, //作者对象
                "apache 2.0",
                "www.baidu.com",
                new ArrayList<>());
    }
}
