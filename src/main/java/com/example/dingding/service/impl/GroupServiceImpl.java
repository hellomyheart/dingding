package com.example.dingding.service.impl;

import com.example.dingding.dto.GroupDto;
import com.example.dingding.entity.Group;
import com.example.dingding.mapper.GroupMapper;
import com.example.dingding.service.GroupService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


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
        public ResponseResult update(Group group){
            System.out.println("group = " + group);
            group.setId(1);
            if (groupMapper.updateInfo(group) > 0) {

                return ResponseResult.ok();

            }else{

                return ResponseResult.fail();

            }





    }
    @Override
    public ResponseResult insertInfo(Group group) {
            group.setCreateTime(new Date());
        int i = groupMapper.insertInfo(group);
        if(i >0){
            return ResponseResult.ok();
        }else {
            return ResponseResult.fail();
        }



    }
}