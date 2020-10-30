package com.example.dingding.service.impl;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.vo.ResponseResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.SignPlan;
import com.example.dingding.mapper.SignPlanMapper;
import com.example.dingding.service.SignPlanService;

import java.util.Date;

@Service
public class SignPlanServiceImpl extends ServiceImpl<SignPlanMapper, SignPlan> implements SignPlanService{
    @Autowired
    private SignPlanMapper mapper;
    @Override
    //TODO 令牌判断添加  状态码
    public ResponseResult insert(String token,SignPlanDto dto) {

        SignPlan signPlan = new SignPlan();
        signPlan.setGId(dto.getGId());
        signPlan.setUId(dto.getUId());
        signPlan.setSpName(dto.getSpName());
        signPlan.setStartTime(dto.getStartTime());
        signPlan.setEndTime(dto.getEndTime());
        signPlan.setStartDate(dto.getStartDate());
        signPlan.setEndDate(dto.getEndDate());
        signPlan.setCreatetime(dto.getCreatetime());
        signPlan.setUpdatetime(dto.getUpdatetime());
        signPlan.setStatus(1);
        mapper.insert(signPlan);

        return ResponseResult.ok();
    }

    @Override
    public ResponseResult update(String token, SignPlanDto dto) {
        SignPlan signPlan = new SignPlan();

        signPlan.getUId();
        signPlan.setSpName(dto.getSpName());
        signPlan.setStartTime(dto.getStartTime());
        signPlan.setEndTime(dto.getEndTime());
        signPlan.setStartDate(dto.getStartDate());
        signPlan.setEndDate(dto.getEndDate());
        signPlan.setCreatetime(dto.getCreatetime());
        signPlan.setUpdatetime(new Date());



        mapper.updatePlan(signPlan);
        return ResponseResult.ok();

    }
}
