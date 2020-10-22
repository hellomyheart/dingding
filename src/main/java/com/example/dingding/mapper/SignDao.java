package com.example.dingding.mapper;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 20:53
 * description:
 */

public interface SignDao {
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
     * @param uId
     * @return
     */
    int summation(int uId);
}
