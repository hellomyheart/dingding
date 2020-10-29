package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.UserLog;
import com.example.dingding.mapper.UserLogMapper;
import com.example.dingding.service.UserLogService;
@Service
public class UserLogServiceImpl extends ServiceImpl<UserLogMapper, UserLog> implements UserLogService{

}
