package com.example.dingding.service.impl;

import com.example.dingding.entity.SignPlan;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.GroupLogMapper;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.service.GroupLogService;
@Service
public class GroupLogServiceImpl extends ServiceImpl<GroupLogMapper, GroupLog> implements GroupLogService{
    @Autowired
    private GroupLogMapper groupLogMapper;


    @Override
    public ResponseResult add(String token,GroupLog groupLog) {
        groupLog.setCreatetime(new Date());
        groupLog.setUId(1);
        int i = groupLogMapper.insert(groupLog);
        if(i>0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}
