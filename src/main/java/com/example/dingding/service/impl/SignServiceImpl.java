package com.example.dingding.service.impl;

import com.example.dingding.entity.Sign;
import com.example.dingding.mapper.SignDao;
import com.example.dingding.service.SignService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 21:10
 * description:
 */
@Service
public class SignServiceImpl implements SignService {

    @Autowired
    private SignDao signDao;
    @Override
    public ResponseResult add(Sign sign) {
        signDao.add(sign);
        return ResponseResult.ok();

    }

    @Override
    public ResponseResult reissue(Sign sign) {
        signDao.reissue(sign);
        return ResponseResult.ok();

    }

    @Override
    public ResponseResult summation(int uId) {

        ResponseResult summation = signDao.summation(uId);
        return ResponseResult.ok(summation);


    }
}
