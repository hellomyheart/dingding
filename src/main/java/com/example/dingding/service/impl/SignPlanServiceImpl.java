package com.example.dingding.service.impl;

import com.example.dingding.mapper.SignPlanDao;
import com.example.dingding.service.SignPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/22 21:02
 * description:
 */
@Service
public class SignPlanServiceImpl implements SignPlanService {
    @Autowired
    private SignPlanDao signPlanDao;
    @Override
    public void delete() {
        signPlanDao.delete();

    }

    @Override
    public void create() {
        signPlanDao.create();

    }
}
