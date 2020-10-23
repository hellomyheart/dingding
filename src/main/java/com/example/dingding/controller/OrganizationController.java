package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.service.OrganizationService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/22 20:02
 * description:
 */
@RestController
@RequestMapping("/organization/")
public class OrganizationController {
    @Autowired
    private OrganizationService organizationService;

    @PostMapping("addOt")
    public ResponseResult add(@RequestBody OrganizationDto dto, HttpServletRequest request){
        return organizationService.add(request.getHeader(SystemConfig.TOKEN_HEADER),dto);
    }

    @PostMapping("deleteOt")
    public ResponseResult deleteOt(Integer id){
        return organizationService.deleteOt(id);
    }
}
