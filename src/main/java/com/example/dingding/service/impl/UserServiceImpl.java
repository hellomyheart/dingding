package com.example.dingding.service.impl;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.dingding.config.RedisKeyConfig;
import com.example.dingding.dto.UserDto;
import com.example.dingding.entity.User;
import com.example.dingding.mapper.UserMapper;
import com.example.dingding.service.UserService;
import com.example.dingding.third.JedisUtil;
import com.example.dingding.util.EncryptUtil;
import com.example.dingding.util.StrUtil;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @description
 * @className: UserServiceImpl
 * @package: com.example.dingding.service.impl
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:55x
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;
    @Value("$(dingding.passkey)")
    private String pk;

    @Override
    public ResponseResult checkPhone(String phone) {
        if (StrUtil.checkNoEmpty(phone)){
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("phone",phone);
            if (mapper.selectOne(queryWrapper) != null){
                return ResponseResult.fail();
            }else {
                return ResponseResult.ok();//手机号可以用
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult checkNickName(String nickname) {
        if (StrUtil.checkNoEmpty(nickname)) {
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("nickname",nickname);
            if (mapper.selectOne(queryWrapper) != null) {
                return ResponseResult.fail();
            }else {
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult register(UserDto dto) {
        //校验是否可用
        User user=mapper.selectByNamePhone(dto.getNickname(),dto.getPhone());
        if(user==null) {
            //验证码比对
            if (dto.getMsgCode().equals(JedisUtil.getInstance().STRINGS.get(RedisKeyConfig.SMS_RCODE + dto.getPhone()))) {
                //密码 密文 AES
                dto.setPassword(EncryptUtil.aesenc(pk, dto.getPassword()));
                //新增
                User u2 = new User(dto.getPhone(), dto.getNickname(), dto.getPassword(), dto.getEmail(), 1, new Date());
                mapper.insert(u2);
            }
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }


}



