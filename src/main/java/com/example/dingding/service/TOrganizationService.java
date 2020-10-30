package com.example.dingding.service;

import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.entity.TOrganization;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;

public interface TOrganizationService extends IService<TOrganization>{
    /**
     * 创建组织
     * @param header
     * @param organizationDto
     * @return
     */
    ResponseResult add(String header, OrganizationDto organizationDto);

    /**
     * 删除组织
     * @param id
     * @return
     */
    ResponseResult deleteOt(Integer id);
}
