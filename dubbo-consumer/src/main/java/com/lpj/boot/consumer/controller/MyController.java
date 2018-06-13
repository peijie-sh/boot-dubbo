package com.lpj.boot.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lpj.boot.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LPJ
 * @date: 2018/6/13
 */
@RestController
public class MyController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private HelloService helloService;

    @RequestMapping("/sayHello")
    public String register(String name) {
        return helloService.sayHello(name);
    }
}
