package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.dto.UserDto;
import com.example.dingding.dto.UserLoginDto;
import com.example.dingding.dto.UserUpdateDto;
import com.example.dingding.service.TUserService;
import com.example.dingding.service.UserLogService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName:dingding
 * ourther:范崇博
 * time：2020/10/3021:39
 * description:
 */
@RestController
@RequestMapping("/user/")
public class TUserController {
    @Autowired
    private TUserService service;

    //效验手机号
    @GetMapping("checkPhone")
    public ResponseResult checkPhone(String phone){return service.checkPhone(phone);}

    //效验用户名
    @GetMapping("checkNickName")
    public ResponseResult checkNickName(String nickname){return service.checkNickName(nickname);}
    //注册
    @PostMapping("register")
    public ResponseResult register(UserDto dto){return service.register(dto);}

    //登录
    @PostMapping("login")
    public ResponseResult login(@RequestBody UserLoginDto loginDto){
        return service.login(loginDto);
    }
    //找回密码
    @GetMapping("findPwd")
    public ResponseResult findPwd(String email,String code,String newPassword){
        return service.find(email,code,newPassword);
    }
    //修改密码
    @GetMapping("updatePwd")
    public ResponseResult updatePwd(HttpServletRequest request,String code,String email,String password){
        return service.update(request.getHeader(SystemConfig.TOKEN_HEADER),code,email,password);
    }
    //修改个人信息
    @PostMapping("modify")
    public ResponseResult modify(Integer id, UserUpdateDto dto){
       return service.modify(id,dto);
    }





}
