package com.example.dingding.service.impl;

import com.example.dingding.dto.SignPlanDto;
import com.example.dingding.vo.ResponseResult;
import org.apache.ibatis.parsing.TokenHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.SignPlan;
import com.example.dingding.mapper.SignPlanMapper;
import com.example.dingding.service.SignPlanService;
@Service
public class SignPlanServiceImpl extends ServiceImpl<SignPlanMapper, SignPlan> implements SignPlanService{
    @Autowired
    private SignPlanMapper mapper;
    @Override
    //TODO 令牌判断添加
    public ResponseResult insert(String token,SignPlanDto dto) {

        SignPlan signPlan = new SignPlan();
        signPlan.setGId(dto.getGId());
        signPlan.setUId(dto.getUId());
        signPlan.setSpName(dto.getSpName());
        signPlan.setStartTime(dto.getStartTime());
        signPlan.setEndTime(dto.getEndTime());
        signPlan.setStartDate(dto.getStartDate());
        signPlan.setEndDate(dto.getEndDate());
        signPlan.setCreatetime(dto.getCreatetime());
        signPlan.setUpdatetime(dto.getUpdatetime());
        signPlan.setStatus(dto.getStatus());
        mapper.insert(signPlan);

        return ResponseResult.ok();
    }
}
