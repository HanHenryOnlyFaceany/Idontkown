package com.example1.Dontknow.controller;

import com.example1.Dontknow.domain.Ebook;
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

    @GetMapping("/list")
    //定义接口的时候会用到 /hello 就是请求地址
    public List<Ebook> list(){
        return ebookService.list();
    }

}
