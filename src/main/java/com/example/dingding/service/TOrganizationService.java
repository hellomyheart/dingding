package com.example.dingding.service;

import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.entity.TOrganization;
import com.example.dingding.commons.service.BaseService;
import com.example.dingding.vo.ResponseResult;

public interface TOrganizationService extends BaseService<TOrganization>{
    /**
     * 创建组织
     * @param header
     * @param organizationDto
     * @return
     */
    ResponseResult add(String header, OrganizationDto organizationDto);

}
