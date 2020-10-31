package com.example.dingding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dingding.entity.GroupUser;

public interface GroupUserMapper extends BaseMapper<GroupUser> {
    public void delById(Integer uId);
}