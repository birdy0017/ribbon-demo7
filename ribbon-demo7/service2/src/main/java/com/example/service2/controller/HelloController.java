package com.example.service2.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+", 来自 service2 提供的内容";
    }
}
