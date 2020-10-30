package com.example.dingding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dingding.entity.TGroup;

public interface TGroupMapper extends BaseMapper<TGroup> {
    public void updateAll(TGroup tGroup);
}