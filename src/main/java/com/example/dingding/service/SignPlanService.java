package com.example.dingding.service;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.vo.ResponseResult;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:59
 * description:
 */

public interface SignPlanService {
    /**
     * 删除打卡计划
     */
    ResponseResult delete(SignPlanDto dto);

    /**
     * 创建打卡计划
     */
    ResponseResult create( SignPlanDto dto);

}
