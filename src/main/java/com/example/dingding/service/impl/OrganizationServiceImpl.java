package com.example.dingding.service.impl;

import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.mapper.OrganizationMapper;
import com.example.dingding.service.OrganizationService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/22 20:00
 * description:
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationMapper mapper;

    @Override
    public ResponseResult add(String header, OrganizationDto dto) {

        return null;
    }

    @Override
    public ResponseResult deleteOt(Integer id) {

        return null;
    }
}
