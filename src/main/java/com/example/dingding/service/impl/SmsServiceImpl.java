package com.example.dingding.service.impl;

import com.example.dingding.config.RedisKeyConfig;
import com.example.dingding.service.SmsService;
import com.example.dingding.third.JedisUtil;
import com.example.dingding.third.SmsUtil;
import com.example.dingding.util.NumRandomUtil;
import com.example.dingding.vo.ResponseResult;
import org.springframework.stereotype.Service;

/**
 * projectName:dingding
 * ourther:范崇博
 * time：2020/10/2319:24
 * description:
 */
@Service
public class SmsServiceImpl implements SmsService {
    @Override
    public ResponseResult sendRcode(String phone) {
        int code = NumRandomUtil.randomNum(6);
        //发送验证码
        if (SmsUtil.sendRCode(phone,code)) {
            //存储验证码
            JedisUtil.getInstance().STRINGS.setEx(RedisKeyConfig.SMS_RCODE +phone,RedisKeyConfig.RCODE_TIME,code+"");
            //结果返回
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}
