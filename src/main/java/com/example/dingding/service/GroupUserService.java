package com.example.dingding.service;


import com.example.dingding.entity.GroupUser;
import com.example.dingding.vo.ResponseResult;

import javax.servlet.http.HttpServletRequest;

public interface GroupUserService  {
    public ResponseResult add(String token,GroupUser groupUser);
    public ResponseResult delectById(Integer id);
}
