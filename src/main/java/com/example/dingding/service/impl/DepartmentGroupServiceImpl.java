package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.DepartmentGroup;
import com.example.dingding.mapper.DepartmentGroupMapper;
import com.example.dingding.service.DepartmentGroupService;
@Service
public class DepartmentGroupServiceImpl extends ServiceImpl<DepartmentGroupMapper, DepartmentGroup> implements DepartmentGroupService{

}
