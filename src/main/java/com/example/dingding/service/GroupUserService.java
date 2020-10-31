package com.example.dingding.service;

import com.example.dingding.entity.GroupUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;

public interface GroupUserService extends IService<GroupUser>{

    public ResponseResult add(String token, GroupUser groupUser);
    public ResponseResult deleteById(String token,Integer uId);
}
