package com.example.demodocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {


    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
