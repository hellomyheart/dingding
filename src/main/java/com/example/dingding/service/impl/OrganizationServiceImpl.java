package com.example.dingding.service.impl;

import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.entity.Organization;
import com.example.dingding.mapper.OrganizationMapper;
import com.example.dingding.service.OrganizationService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/22 20:00
 * description:
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationMapper organizationMapper;

    @Override
    public ResponseResult add(String header, OrganizationDto dto) {
        Organization organization = new Organization();
        //TODO:等待id上传
        organization.setUid(1);
        organization.setOname(dto.getOname());
        organization.setOaddress(dto.getOaddress());
        organization.setOdescription(dto.getOdescription());
        organization.setCreatetime(new Date());
        organization.setUpdatetime(new Date());

        int insert = organizationMapper.insert(organization);
        if (insert > 0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult deleteOt(Integer id) {
        int i = organizationMapper.deleteById(id);
        if (i > 0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }
}
