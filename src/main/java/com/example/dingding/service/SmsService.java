package com.example.dingding.service;

import com.example.dingding.vo.ResponseResult;
import org.springframework.web.bind.annotation.ResponseBody;

public interface SmsService {

    ResponseResult sendRcode(String phone);//发送短信验证码
}
