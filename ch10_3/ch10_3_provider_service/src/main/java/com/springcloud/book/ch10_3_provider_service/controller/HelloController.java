package com.springcloud.book.ch10_3_provider_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date: 2019/8/22 16:46
 * @Version: 1.0
 * @Desc:
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return "Hello, name is " + name;
    }
}
