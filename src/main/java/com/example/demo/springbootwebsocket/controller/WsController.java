package com.example.demo.springbootwebsocket.controller;

import com.example.demo.springbootwebsocket.modal.WiselyRequest;
import com.example.demo.springbootwebsocket.modal.WiselyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WsController {

    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyRequest request) {
        String responseTxt = "Welcome, " + request.getName() + "!";
        System.out.println(responseTxt);
        return new WiselyResponse(responseTxt);
    }

}

