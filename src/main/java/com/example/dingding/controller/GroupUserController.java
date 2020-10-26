package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.entity.GroupUser;
import com.example.dingding.service.GroupUserService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/22 21:55
 * description:
 */
@RestController
@RequestMapping("/group")
public class GroupUserController {
    @Autowired
    private GroupUserService groupUserService;
    @GetMapping("/insert")
    public ResponseResult add(HttpServletRequest request,GroupUser groupUser){
        return groupUserService.add(request.getHeader(SystemConfig.TOKEN_HEADER),groupUser);


    }
    @GetMapping("/delect")
    public ResponseResult delectById(int id){

        return groupUserService.delectById(id);
    }
}