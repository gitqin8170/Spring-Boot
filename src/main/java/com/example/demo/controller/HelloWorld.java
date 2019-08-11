package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
@GetMapping(value = "/")
    public String hello()
    {
        System.out.println("世界你好");
        return "什么垃圾电脑";
    }
}
