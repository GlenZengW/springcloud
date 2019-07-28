package com.ut.eurekaribbon.controller;

import com.ut.eurekaribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonTestController {

    @Autowired
    RibbonService ribbonService;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String getRibbonBalance() {
        return ribbonService.getClientHi();
    }

    @GetMapping("/testRibbon")
    public String getLoadBalancerClient() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return "port:" + instance.getPort();
    }
}
