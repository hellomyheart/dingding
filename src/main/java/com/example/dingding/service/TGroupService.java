package com.example.dingding.service;

import com.example.dingding.entity.GroupLog;
import com.example.dingding.entity.TGroup;
import com.example.dingding.commons.service.BaseService;
import com.example.dingding.vo.ResponseResult;

public interface TGroupService extends BaseService<TGroup>{

    public ResponseResult add(String token, TGroup tGroup);
    public ResponseResult updateAll(String token,TGroup tGroup);

}
