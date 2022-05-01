package com.example.demo.controller.rsocket;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class PingController {

    @MessageMapping("ping")
    public Mono<String> ping() {
        return Mono.just("pong");
    }
}
