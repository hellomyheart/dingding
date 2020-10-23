package com.example.dingding.service;


import com.example.dingding.entity.GroupUser;
import com.example.dingding.vo.ResponseResult;

public interface GroupUserService  {
    public ResponseResult add(GroupUser groupUser);
    public ResponseResult delectById(Integer id);
}
