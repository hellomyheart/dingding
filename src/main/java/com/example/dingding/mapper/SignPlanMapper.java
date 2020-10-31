package com.example.dingding.mapper;

 import com.example.dingding.commons.mapper.BaseMapper;

import com.example.dingding.entity.SignPlan;


public interface SignPlanMapper extends BaseMapper<SignPlan> {
    void updatePlan(SignPlan signPlan);

}
