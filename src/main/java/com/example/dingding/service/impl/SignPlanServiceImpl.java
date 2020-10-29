package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.SignPlan;
import com.example.dingding.mapper.SignPlanMapper;
import com.example.dingding.service.SignPlanService;
@Service
public class SignPlanServiceImpl extends ServiceImpl<SignPlanMapper, SignPlan> implements SignPlanService{

}
