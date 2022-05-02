package com.example.demo.controller.graphql;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class GreetingController {

    @QueryMapping(name = "greeting")
    public Mono<String> greeting() {
        return Mono.just("hello world");
    }
}
