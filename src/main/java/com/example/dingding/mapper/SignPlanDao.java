package com.example.dingding.mapper;

import com.example.dingding.entity.SignPlan;
import com.example.dingding.vo.ResponseResult;
import org.apache.ibatis.annotations.Param;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:53
 * description:
 */

public interface SignPlanDao {
    /**
     * 删除打卡计划
     */
    ResponseResult delete(SignPlan signPlan);

    /**
     * 创建打卡计划
     */
    ResponseResult create(SignPlan signPlan);
}
