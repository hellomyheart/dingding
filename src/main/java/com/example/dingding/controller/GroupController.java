package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.entity.Group;
import com.example.dingding.service.GroupService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/22 21:18
 * description:
 */
@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/update")
    public ResponseResult update (HttpServletRequest request,Group group){

        return groupService.update(request.getHeader(SystemConfig.TOKEN_HEADER),group);
    }

    @RequestMapping("/set")
    public ResponseResult insertInfo(HttpServletRequest request,Group group){
        return groupService.insertInfo(request.getHeader(SystemConfig.TOKEN_HEADER),group);
    }

}
