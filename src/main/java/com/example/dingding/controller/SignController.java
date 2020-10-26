package com.example.dingding.controller;

import com.example.dingding.entity.Sign;
import com.example.dingding.service.SignService;
import com.example.dingding.vo.ResponseResult;
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
    public ResponseResult add(Sign sign){
        return signService.add(sign);

    }
    @RequestMapping("/reissue")
    public ResponseResult reissue(Sign sign){
        return signService.reissue(sign);

    }
    @RequestMapping("/reissue")
    public ResponseResult summation(int uId){
        return signService.summation(uId);

    }


}
