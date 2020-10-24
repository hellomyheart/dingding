package com.example.dingding.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dingding.entity.OrganizationLog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/24 21:00
 * description:
 */
public interface OrganizationLogMapper extends BaseMapper<OrganizationLog> {

    List<OrganizationLog> all(Integer id);
}
