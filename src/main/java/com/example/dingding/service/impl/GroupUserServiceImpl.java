package com.example.dingding.service.impl;

import com.example.dingding.entity.GroupUser;
import com.example.dingding.mapper.GroupMapper;
import com.example.dingding.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/22 21:48
 * description:
 */
@Service
public class GroupUserServiceImpl implements GroupUserService {
    @Autowired
    private GroupMapper groupMapper;
    @Override
    public void add(GroupUser groupUser) {

    }

    @Override
    public void delectById(int id) {
        groupMapper.deleteById(id);

    }
}
