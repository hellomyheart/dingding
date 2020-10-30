package com.example.dingding.service;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.entity.SignPlan;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;

public interface SignPlanService extends IService<SignPlan>{
    /**
     *
     * @param token
     * @param dto
     * @return
     */
    ResponseResult insert(String token,SignPlanDto dto);


}
