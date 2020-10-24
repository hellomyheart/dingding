package com.example.dingding.service.impl;

import com.example.dingding.mapper.OrganizationLogMapper;
import com.example.dingding.service.OrganizationLogService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/24 21:05
 * description:
 */
@Service
public class OrganizationLogServiceImpl implements OrganizationLogService {
    @Autowired
    private OrganizationLogMapper organizationLogMapper;

    @Override
    public ResponseResult all(Integer id) {

        return ResponseResult.ok();
    }
}
