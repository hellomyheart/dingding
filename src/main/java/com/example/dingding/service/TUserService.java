package com.example.dingding.service;

import com.example.dingding.dto.UserDto;
import com.example.dingding.dto.UserLoginDto;
import com.example.dingding.dto.UserUpdateDto;
import com.example.dingding.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;

public interface TUserService extends IService<TUser>{

    //效验手机号
    ResponseResult checkPhone(String phone);
    //效验用户名
    ResponseResult checkNickName(String nicename);
    //注册
    ResponseResult register(UserDto dto);
    //登录
    ResponseResult login(UserLoginDto loginDto);
    //找回密码
    ResponseResult find(String email,String code,String password);
    //修改密码
    ResponseResult update(String token,String code,String email,String password);
    //修改个人信息
    ResponseResult modify(Integer id, UserUpdateDto dto);



}
