package com.alin.swagger.controller;

import com.alin.swagger.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author 李钰林
 * @date 2021/4/13
 */
//给控制器加注释
@Api(tags = "hello控制器")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    /*如果返回值类型有实体类就是自动被swagger扫描到页面的model中*/
    //给接口加注释
    @ApiOperation("hello接口")
    @PostMapping("user")
    public User getUser(@ApiParam("用户名") String username){  //给参数加注释
        return new User();
    }
}
