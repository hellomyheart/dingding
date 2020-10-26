package com.example.dingding.service;

import com.example.dingding.entity.Sign;
import com.example.dingding.vo.ResponseResult;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 21:05
 * description:
 */

public interface SignService {
    /**
     * 打卡
     */
    ResponseResult add(Sign sign);

    /**
     * 补卡
     */
    ResponseResult reissue(Sign sign);

    /**
     * 打卡统计
     * @return
     */
    ResponseResult summation(int uId);
}
