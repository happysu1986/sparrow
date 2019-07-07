package com.sparrow.eureka.service.provider.controller;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xile.su on 2019/7/7
 */
@RestController
public class ShutdownController {

    @Autowired
    private EurekaClient eurekaClient;

    @GetMapping("/shutdown")
    public void shutdown() {
//        EurekaModule
        eurekaClient.shutdown();
    }
}
