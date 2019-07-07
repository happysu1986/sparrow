package com.sparrow.eureka.service.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2019/7/7
 */
@RestController
public class TicketController {

    @GetMapping("/ticket")
    public String getTicket() {
        return "123456";
    }
}
