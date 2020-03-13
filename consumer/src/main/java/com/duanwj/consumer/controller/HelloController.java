package com.duanwj.consumer.controller;

import com.duanwj.common.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 时光
 * @date 2020/3/13 18:08
 * @description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping
    public String hello() {
        return helloService.sayHello("时光");
    }
}
