package com.example.dingding.service;

import com.example.dingding.dto.GroupDto;
import com.example.dingding.entity.Group;
import com.example.dingding.vo.ResponseResult;

public interface GroupService {

    public ResponseResult update(String token,Group group);

    public ResponseResult insertInfo(String token,Group group);

}