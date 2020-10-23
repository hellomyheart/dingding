package com.example.dingding.service;

import com.example.dingding.entity.User;
import com.example.dingding.vo.ResponseResult;
import com.sun.prism.impl.Disposer;

import java.util.List;

/**
 * @description
 * @className: UserService
 * @package: com.example.dingding.service
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:54
 */
public interface UserService {



    ResponseResult checkPhone(String phone);

    ResponseResult checkNickName(String name);






}
