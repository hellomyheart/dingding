package com.example.dingding.service;

import com.example.dingding.entity.GroupUser;
import com.example.dingding.commons.service.BaseService;
import com.example.dingding.vo.ResponseResult;

public interface GroupUserService extends BaseService<GroupUser>{

    public ResponseResult add(String token, GroupUser groupUser);
    public ResponseResult deleteById(String token,Integer uId);
}
