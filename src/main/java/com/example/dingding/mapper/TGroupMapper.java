package com.example.dingding.mapper;

 import com.example.dingding.commons.mapper.BaseMapper;
import com.example.dingding.entity.TGroup;

public interface TGroupMapper extends BaseMapper<TGroup> {
    public void updateAll(TGroup tGroup);
}
