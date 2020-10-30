package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.dto.OrganizationDto;
import com.example.dingding.service.TOrganizationService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/30 20:00
 * description:组织管理控制器
 */
@RestController
@RequestMapping("/organization")
public class OrganizationController {
    @Autowired
    private TOrganizationService tOrganizationService;

    /**
     * 创建组织
     * @return
     */
    @PostMapping("/add")
    public ResponseResult add(@RequestBody OrganizationDto organizationDto, HttpServletRequest request){
        return tOrganizationService.add(request.getHeader(SystemConfig.TOKEN_HEADER),organizationDto);
    }

    /**
     * 删除组织
     * @param id
     * @return
     */
    @PostMapping("/delete")
    public ResponseResult deleteOt(Integer id){
        return tOrganizationService.deleteOt(id);
    }
}
