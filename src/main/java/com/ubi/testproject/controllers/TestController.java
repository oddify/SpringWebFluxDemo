package com.ubi.testproject.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/test/")
public class TestController {

    @Operation(summary = "Say Hello")
    @PostMapping("path")
    public Mono<String> postMethodName(@RequestBody String entity) {
        
        return Mono.just("Hello there");
    }
    
}
