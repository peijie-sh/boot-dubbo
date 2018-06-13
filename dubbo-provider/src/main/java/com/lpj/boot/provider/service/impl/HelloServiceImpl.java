package com.lpj.boot.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lpj.boot.api.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: LPJ
 * @date: 2018/6/12
 */
@Service
@Slf4j
@Component
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }
}
