package com.example.dingding.service.impl;

import com.example.dingding.dto.UserDto;
import com.example.dingding.dto.UserLoginDto;
import com.example.dingding.dto.UserUpdateDto;
import com.example.dingding.vo.ResponseResult;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.TUserMapper;
import com.example.dingding.entity.TUser;
import com.example.dingding.service.TUserService;
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService{

    @Override
    public ResponseResult checkPhone(String phone) {
        return null;
    }

    @Override
    public ResponseResult checkNickName(String nicename) {
        return null;
    }

    @Override
    public ResponseResult register(UserDto dto) {
        return null;
    }

    @Override
    public ResponseResult login(UserLoginDto loginDto) {
        return null;
    }

    @Override
    public ResponseResult find(String email, String code, String password) {
        return null;
    }

    @Override
    public ResponseResult update(String token, String code, String email, String password) {
        return null;
    }

    @Override
    public ResponseResult modify(Integer id, UserUpdateDto dto) {
        return null;
    }
}
