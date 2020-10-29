package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.DepartmentLogMapper;
import com.example.dingding.entity.DepartmentLog;
import com.example.dingding.service.DepartmentLogService;
@Service
public class DepartmentLogServiceImpl extends ServiceImpl<DepartmentLogMapper, DepartmentLog> implements DepartmentLogService{

}
