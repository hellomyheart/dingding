package com.example.dingding.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.dingding.config.SystemConfig;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.entity.TGroup;
import com.example.dingding.service.GroupLogService;
import com.example.dingding.service.TGroupService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/30 20:32
 * description:
 */
@RestController
@RequestMapping("/group")
public class TGroupController {
    @Autowired
    private TGroupService tGroupService;
    @RequestMapping("/set")
    public ResponseResult add(HttpServletRequest request, TGroup tGroup){
        return tGroupService.add(request.getHeader(SystemConfig.TOKEN_HEADER),tGroup);
    }

    @RequestMapping("/update")
    public ResponseResult updateAll(HttpServletRequest request,TGroup tGroup){
        return tGroupService.updateAll(request.getHeader(SystemConfig.TOKEN_HEADER),tGroup);
    }
}
