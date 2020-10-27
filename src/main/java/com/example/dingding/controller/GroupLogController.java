package com.example.dingding.controller;

import com.example.dingding.entity.GroupUser;
import com.example.dingding.service.GroupService;
import com.example.dingding.service.GroupUserService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/27 17:59
 * description:
 */
@RestController
@RequestMapping("/group")
public class GroupLogController {
    @Autowired
   private GroupUserService groupUserService;

    @PostMapping("add")
    public ResponseResult add(@RequestParam("groupUser")String token ,GroupUser groupUser) {
        return groupUserService.add(token,groupUser);
    }

    @GetMapping("delete/{id}")
    public ResponseResult delete(@PathVariable("id") Integer id){
        return groupUserService.deleteById(id);

    }

}
