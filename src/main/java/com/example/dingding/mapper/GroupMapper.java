package com.example.dingding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dingding.entity.Group;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupMapper  extends BaseMapper<Group> {

    int updateInfo(Group group);
    int insertInfo(Group group);

}
