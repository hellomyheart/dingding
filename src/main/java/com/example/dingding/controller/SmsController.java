package com.example.dingding.controller;

import com.example.dingding.service.SmsService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName:dingding
 * ourther:范崇博
 * time：2020/10/2320:13
 * description:
 */
@RestController
@RequestMapping("/sms/")
public class SmsController {
    @Autowired
    private SmsService service;

    @GetMapping("sendRCode")
    public ResponseResult sendRCode(String phone){
        return service.sendRcode(phone);
    }
}
