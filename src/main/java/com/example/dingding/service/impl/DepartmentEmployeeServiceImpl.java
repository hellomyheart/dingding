package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.DepartmentEmployeeMapper;
import com.example.dingding.entity.DepartmentEmployee;
import com.example.dingding.service.DepartmentEmployeeService;
@Service
public class DepartmentEmployeeServiceImpl extends ServiceImpl<DepartmentEmployeeMapper, DepartmentEmployee> implements DepartmentEmployeeService{

}
