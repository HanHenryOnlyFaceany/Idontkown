package com.example1.Dontknow.controller;

import com.example1.Dontknow.domain.Test;
import com.example1.Dontknow.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//一般用来返回字符串
//@Controller
//一般是用来返回一个页面 一般是前后端分离 所以用不到这个接口
public class TestController {
    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    //定义接口的时候会用到 /hello 就是请求地址
    public String hello(){
        return "Hello,World!"+ testHello;
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post," + name;
    }

    @GetMapping("/test/list")
    //定义接口的时候会用到 /hello 就是请求地址
    public List<Test> list(){
        return testService.list();
    }

}
