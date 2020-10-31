package com.example.dingding.service;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.entity.SignPlan;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;

public interface SignPlanService extends IService<SignPlan>{
    /**
     *创建打卡计划
     * @param token
     * @param dto
     * @return
     */
    ResponseResult insert(String token,SignPlanDto dto);

    /**
     * 修改打卡计划
     * @param token
     * @param dto
     * @return
     */
    ResponseResult update(String token,SignPlanDto dto);


}
