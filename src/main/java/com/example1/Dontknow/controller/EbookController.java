package com.example1.Dontknow.controller;

import com.example1.Dontknow.domain.Ebook;
import com.example1.Dontknow.resp.CommonResp;
import com.example1.Dontknow.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//一般用来返回字符串
//@Controller
//一般是用来返回一个页面 一般是前后端分离 所以用不到这个接口
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

//    @GetMapping("/list")
//    //添加一个模糊查询
//    //定义接口的时候会用到 /hello 就是请求地址
//    public CommonResp list(){
//        CommonResp<List<Ebook>> resp = new CommonResp<>();//ctrl+alt+v 快速生成一个变量
//
//        List<Ebook> list = ebookService.list();
//
//        resp.setContent(list);
//
//        return resp;
//    }
    @GetMapping("/list")
    //添加一个模糊查询
    //定义接口的时候会用到 /hello 就是请求地址
    public CommonResp list(String name){
        CommonResp<List<Ebook>> resp = new CommonResp<>();//ctrl+alt+v 快速生成一个变量

        List<Ebook> list = ebookService.list(name);

        resp.setContent(list);

        return resp;
    }

}
