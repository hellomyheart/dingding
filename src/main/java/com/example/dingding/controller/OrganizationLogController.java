package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.service.OrganizationLogService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/24 21:07
 * description:
 */
@RestController
@RequestMapping("/organizationlog")
public class OrganizationLogController {
    @Autowired
    private OrganizationLogService organizationLogService;

    @GetMapping("all")
    public ResponseResult all(HttpServletRequest request){
        return organizationLogService.all(request.getIntHeader(SystemConfig.TOKEN_HEADER));
    }
}
