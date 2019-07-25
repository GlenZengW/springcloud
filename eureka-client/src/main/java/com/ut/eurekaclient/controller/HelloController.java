package com.ut.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Hello controller.
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    /**
     * Say hello string.
     *
     * @param id the id
     * @return the string
     */
    @GetMapping("/hi/{id}")
    public String sayHello(@PathVariable String id) {
        return "hi, id:" + id  + ", port:" + port;
    }
}
