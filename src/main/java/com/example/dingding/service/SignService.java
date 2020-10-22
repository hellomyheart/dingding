package com.example.dingding.service;

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
    void add();

    /**
     * 补卡
     */
    void reissue();

    /**
     * 打卡统计
     * @return
     */
    int summation(int uId);
}
