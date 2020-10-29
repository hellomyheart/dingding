package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.GroupLogMapper;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.service.GroupLogService;
@Service
public class GroupLogServiceImpl extends ServiceImpl<GroupLogMapper, GroupLog> implements GroupLogService{

}
