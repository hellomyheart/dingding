package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.TDepartment;
import com.example.dingding.mapper.TDepartmentMapper;
import com.example.dingding.service.TDepartmentService;
@Service
public class TDepartmentServiceImpl extends ServiceImpl<TDepartmentMapper, TDepartment> implements TDepartmentService{

}
