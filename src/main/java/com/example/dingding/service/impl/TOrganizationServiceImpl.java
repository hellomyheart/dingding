package com.example.dingding.service.impl;

import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.TOrganizationMapper;
import com.example.dingding.entity.TOrganization;
import com.example.dingding.service.TOrganizationService;
@Service
public class TOrganizationServiceImpl extends ServiceImpl<TOrganizationMapper, TOrganization> implements TOrganizationService{

    @Autowired
    private TOrganizationMapper tOrganizationMapper;

    @Override
    public ResponseResult add(String header, OrganizationDto organizationDto) {
        TOrganization tOrganization = new TOrganization();
        //TODO:等待后面修改
        tOrganization.setUId(1);
        tOrganization.setOName(organizationDto.getOName());
        tOrganization.setOAddress(organizationDto.getOAddress());
        tOrganization.setODescription(organizationDto.getODescription());
        tOrganization.setCreatetime(new Date());
        tOrganization.setUpdatetime(new Date());

        int insert = tOrganizationMapper.insert(tOrganization);
        if (insert > 0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

}
