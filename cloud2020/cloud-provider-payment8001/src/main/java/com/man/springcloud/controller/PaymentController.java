package com.man.springcloud.controller;

import com.man.springcloud.entities.CommonResult;
import com.man.springcloud.entities.Payment;
import com.man.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentServiceImpl paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("*********插入结果:"+result);
        if (result>0){
            return new CommonResult(200,"新增成功",result);
        }else{
            return new CommonResult(441,"新增成功");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id")  Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*********插入结果:"+payment);
//        return new CommonResult(200,"查询成功",payment);
        if (payment!=null){
            return new CommonResult(200,"查询成功",payment);
        }else{
            return new CommonResult(444,"查询无记录，查询id是:"+id,null);
        }
    }
}