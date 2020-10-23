package com.example.dingding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.example.dingding.dto.UserDto;
import com.example.dingding.entity.User;
import com.example.dingding.service.UserService;
import com.example.dingding.util.StrUtil;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @className: UserServiceImpl
 * @package: com.example.dingding.service.impl
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:55
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDto dto;
    @Value("${dingding.passkey}")
    private String pk;


    @Override
    public ResponseResult checkPhone(String phone) {
        if (StrUtil.checkNoEmpty(phone)){
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("phone",phone);
            if (queryWrapper.eq(phone) != null){
                return ResponseResult.fail();
            }else {
                return ResponseResult.ok();
            }
    }


}

    @Override
    public ResponseResult checkNickName(String name) {
        if (StrUtil.checkNoEmpty(name)){
            QueryWrapper<User> wrapper = new QueryWrapper<>();
            q
        }
        return null;
    }
}
