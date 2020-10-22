package com.example.dingding.service.impl;

import com.example.dingding.mapper.SignDao;
import com.example.dingding.service.SignService;
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
    public void add() {
        signDao.add();

    }

    @Override
    public void reissue() {
        signDao.reissue();

    }

    @Override
    public int summation(int uId) {
        int summation = signDao.summation(uId);
        return summation;

    }
}
