package com.example.dingding.controller;

import com.example.dingding.config.SystemConfig;
import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.service.SignPlanService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/30 20:35
 * description:
 */
@RestController
@RequestMapping("/sign")
public class SignPlanController {
    @Autowired
    private SignPlanService service;

    @GetMapping("/insert")
    public ResponseResult insert(HttpServletRequest request,SignPlanDto dto){
         return service.insert(request.getHeader(SystemConfig.TOKEN_HEADER),dto);

    }
    @GetMapping("/update")
    public ResponseResult update(HttpServletRequest request,SignPlanDto dto){
        return service.update(request.getHeader(SystemConfig.TOKEN_HEADER),dto);
    }

}
