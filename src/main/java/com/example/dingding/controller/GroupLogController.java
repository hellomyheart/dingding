package com.example.dingding.controller;
import com.example.dingding.config.SystemConfig;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.service.GroupLogService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/25 16:26
 * description:
 */
@RestController
@RequestMapping("/groupLog")
public class GroupLogController {
    @Autowired
    private GroupLogService groupLogService;
   @GetMapping("all")
    public ResponseResult all(HttpServletRequest request){
       return groupLogService.all(request.getIntHeader(SystemConfig.TOKEN_HEADER));
   }


}
