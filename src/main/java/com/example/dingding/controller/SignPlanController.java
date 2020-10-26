package com.example.dingding.controller;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.entity.SignPlan;
import com.example.dingding.service.SignPlanService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 22:13
 * description:
 */
@RestController
@RequestMapping("/signPlan")
public class SignPlanController {
    @Autowired
    private SignPlanService signPlanService;
    @RequestMapping("/delete")
    public ResponseResult delete(SignPlanDto dto) {

        return signPlanService.delete(dto);

    }
    @RequestMapping("/create")
    public ResponseResult create(SignPlanDto dto) {
        return signPlanService.create(dto);

    }

}
