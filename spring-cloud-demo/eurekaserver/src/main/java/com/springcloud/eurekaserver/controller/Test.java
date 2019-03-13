package com.springcloud.eurekaserver.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    Logger logger = LoggerFactory.getLogger(Test.class);

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String hello() {
//        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
//        //打印服务的服务id
//        logger.info("*********" + instance.getServiceId());
        return "hello,this is hello-service";
    }

    @GetMapping("/eureka")
    public String test() {
        return "";
    }
}
