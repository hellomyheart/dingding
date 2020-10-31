package com.example.dingding.mapper;

 import com.example.dingding.commons.mapper.BaseMapper;
import com.example.dingding.entity.Sign;

public interface SignMapper extends BaseMapper<Sign> {
    void insertSign(Sign sign);
}
