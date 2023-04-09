package com.example1.Dontknow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//一般用来返回字符串
@Controller
//一般是用来返回一个页面 一般是前后端分离 所以用不到这个接口
public class TestController {

    @RequestMapping("/hello")
    //定义接口的时候会用到 /hello 就是请求地址
    public String hello(){
        return "helloworld";
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World! Post," + name;
    }
}
