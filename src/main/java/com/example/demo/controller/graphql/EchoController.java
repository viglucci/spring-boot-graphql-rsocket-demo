package com.example.demo.controller.graphql;

import com.example.demo.domain.model.Echo;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
public class EchoController {

    @QueryMapping(name = "echo")
    public Mono<Echo> echo(@Argument String input) {
        return Mono.just(new Echo(input));
    }
}
