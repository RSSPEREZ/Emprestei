package com.emprestei.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Teste {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        String s = "hello world";
        return s;
    }

}
