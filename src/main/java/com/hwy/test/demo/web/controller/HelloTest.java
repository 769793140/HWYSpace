package com.hwy.test.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyTest")
public class HelloTest {
    @RequestMapping("/hello")
    public String test(){
        return "Hello Word";
    }
}
