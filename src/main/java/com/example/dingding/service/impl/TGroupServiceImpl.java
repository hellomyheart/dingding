package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.TGroupMapper;
import com.example.dingding.entity.TGroup;
import com.example.dingding.service.TGroupService;
@Service
public class TGroupServiceImpl extends ServiceImpl<TGroupMapper, TGroup> implements TGroupService{

}
