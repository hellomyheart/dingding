package com.example.dingding.mapper;

import com.baomidou.mybatisplus.annotation.TableName;
import com.example.dingding.dto.SignDto;
import com.example.dingding.entity.Sign;
import com.example.dingding.vo.ResponseResult;

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
    ResponseResult add(Sign sign);

    /**
     * 补卡
     */
    ResponseResult reissue(Sign sign);


    ResponseResult summation(int uId);
}
