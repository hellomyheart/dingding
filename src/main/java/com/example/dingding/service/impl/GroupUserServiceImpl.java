package com.example.dingding.service.impl;

import com.example.dingding.entity.GroupUser;
import com.example.dingding.mapper.GroupMapper;
import com.example.dingding.mapper.GroupUserMapper;
import com.example.dingding.service.GroupUserService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/22 21:48
 * description:
 */
@Service
public class GroupUserServiceImpl implements GroupUserService {
    @Autowired
    private GroupUserMapper groupUserMapper;
    @Override
    public ResponseResult add(GroupUser groupUser) {
        groupUser.setCreateTime(new Date());
        int insert = groupUserMapper.insert(groupUser);
        if(insert >0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();

    }

    @Override
    public ResponseResult delectById(Integer id) {
        int i = groupUserMapper.deleteById(id);
        if(i >0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();


    }
}
