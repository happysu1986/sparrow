package com.sparrow.eureka.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xile.su on 2019/7/7
 */
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        /*application:name + methodName*/
        return name + ": " + restTemplate.getForObject("http://SERVICE-PROVIDER/ticket", String.class);
    }
}
