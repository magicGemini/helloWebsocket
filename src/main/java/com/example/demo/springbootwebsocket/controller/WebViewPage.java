package com.example.demo.springbootwebsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebViewPage {

    @RequestMapping("/")
    public String index(){
        return "forward:/index.html";
    }
}
