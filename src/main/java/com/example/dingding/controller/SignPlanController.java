package com.example.dingding.controller;

import com.example.dingding.service.SignPlanService;
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
    public void delete() {
        signPlanService.delete();

    }
    @RequestMapping("/create")
    public void create() {
        signPlanService.create();

    }

}
