package com.netcracker.kupriyanov.practice.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainController {

    @RequestMapping("/")
    String home(){
        return "Hello World";
    }
}
