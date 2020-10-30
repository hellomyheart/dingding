package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.service.GroupLogService;
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
@RequestMapping("group")
public class GroupLogController {
    @Autowired
    private GroupLogService groupLogService;
    @RequestMapping("set")
    public ResponseResult add(HttpServletRequest request, GroupLog groupLog){
        return groupLogService.add(request.getHeader(SystemConfig.TOKEN_HEADER),groupLog);
    }
}
