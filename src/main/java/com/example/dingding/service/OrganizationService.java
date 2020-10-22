package com.example.dingding.service;

import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.vo.ResponseResult;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/22 20:00
 * description:
 */
public interface OrganizationService {

    ResponseResult add(String header, OrganizationDto dto);

    ResponseResult deleteOt(Integer id);
}
