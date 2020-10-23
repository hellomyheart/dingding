package com.example.dingding.controller;

import com.example.dingding.entity.Group;
import com.example.dingding.service.GroupService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @RequestMapping("/set")
    private ResponseResult found(String groupName){
        return new ResponseResult
    }

    @GetMapping("update")
    public void update(){
        Group group = new Group();
        group.setId(2);
        group.setGName("");
        groupService.update(group);
    }

}
