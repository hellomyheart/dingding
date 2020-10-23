package com.example.dingding.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.dingding.dto.UserDto;
import com.example.dingding.mapper.UserMapper;
import com.example.dingding.service.UserService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @className: UserController
 * @package: com.example.dingding.controller
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:34
 */
@RestController
//yml中配置了统一前缀
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService service;


//效验手机号
    @GetMapping("checkPhone")
    public ResponseResult checkP(String phone){

        return service.checkPhone(phone);
    }
    //效验用户名
    @GetMapping("checkNickName")
    public ResponseResult checkN(String name){

        return service.checkNickName(name);
    }
    //注册
    @PostMapping("register")
    public ResponseResult register(UserDto dto){
        return service.register(dto);
    }
}
