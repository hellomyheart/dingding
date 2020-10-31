package com.example.dingding.mapper;

 import com.example.dingding.commons.mapper.BaseMapper;
import com.example.dingding.entity.GroupUser;

public interface GroupUserMapper extends BaseMapper<GroupUser> {
    public void delById(Integer uId);
}
