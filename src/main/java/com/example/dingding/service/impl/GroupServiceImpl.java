package com.example.dingding.service.impl;

import com.example.dingding.entity.Group;
import com.example.dingding.mapper.GroupMapper;
import com.example.dingding.service.GroupService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/22 20:56
 * description:
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupMapper groupMapper;
    @Override
    public ResponseResult found(String groupName,Integer uId) {
        Group g= new Group(uId,groupName,new Date(),new Date());
        int row =  groupMapper.insert(g);
        if (row >0){
            return  ResponseResult.getResponseResult();
        }
        return ResponseResult.getResponseResult();
    }

    @Override
    public void update(Group group) {

    }


}
