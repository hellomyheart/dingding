package com.example.dingding.service.impl;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.entity.Sign;
import com.example.dingding.entity.SignPlan;
import com.example.dingding.mapper.SignPlanDao;
import com.example.dingding.service.SignPlanService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 21:02
 * description:
 */
@Service
public class SignPlanServiceImpl implements SignPlanService {
    @Autowired
    private SignPlanDao signPlanDao;


    @Override
    public ResponseResult delete( SignPlanDto dto) {
        SignPlan signPlan = new SignPlan(dto.getId());
        return ResponseResult.ok(signPlan);
    }

    /**
     * 创建打卡计划
     * @return
     */
    @Override
    public ResponseResult create(SignPlanDto dto) {
        Sign sign = new Sign(dto.getgId(),dto.getuId(),dto.getSpname(),dto.getStarttime(),
                dto.getEndtime(),dto.getStartDate(),dto.getEndDate());
        return ResponseResult.ok(sign);
    }
}

