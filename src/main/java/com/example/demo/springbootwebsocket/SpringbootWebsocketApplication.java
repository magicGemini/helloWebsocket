package com.example.demo.springbootwebsocket;

import com.example.demo.springbootwebsocket.config.WebsocketConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo.springbootwebsocket.controller",
        "com.example.demo.springbootwebsocket.config"})
@Import({WebsocketConfig.class})
public class SpringbootWebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebsocketApplication.class, args);
        System.out.println("server running at http://localhost:8080");
    }

}
