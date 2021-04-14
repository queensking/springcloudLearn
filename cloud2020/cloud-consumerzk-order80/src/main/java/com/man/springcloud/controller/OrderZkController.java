package com.man.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class OrderZkController {
    public static final String INNOVE_URL="http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/order/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INNOVE_URL+"/payment/zk",String.class);
        return result;
    }
}
