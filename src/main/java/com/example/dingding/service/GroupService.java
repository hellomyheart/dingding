package com.example.dingding.service;

import com.example.dingding.entity.Group;
import com.example.dingding.vo.ResponseResult;

public interface GroupService {

    public void update(Group group);

    ResponseResult found(String groupName,Integer id);

}
