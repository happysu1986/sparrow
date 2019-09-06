package com.sparrow.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2019/9/6
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @RequestMapping("/hello")
    public String from() {
        return "hi name is " + this.name;
    }
}
