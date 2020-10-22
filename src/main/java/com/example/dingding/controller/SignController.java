package com.example.dingding.controller;

import com.example.dingding.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 21:25
 * description:
 */
@RestController
@RequestMapping("/sign")
public class SignController {
    @Autowired
    private SignService signService;
    @RequestMapping("/add")
    public void add(){
        signService.add();

    }
    @RequestMapping("/reissue")
    public void reissue(){
        signService.reissue();

    }
    @RequestMapping("/reissue")
    public int summation(int uId){
        int summation = signService.summation(uId);
        return summation;
    }


}
