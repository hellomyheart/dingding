package com.example.dingding.service.impl;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.mapper.GroupLogMapper;
import com.example.dingding.service.GroupLogService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/25 13:42
 * description:
 */
@Service
public class GroupLogServiceImpl implements GroupLogService {
    @Autowired
    private  GroupLogMapper groupLogMapper;
    @Override
    public ResponseResult all(Integer id) {

        return ResponseResult.ok();
    }
}
