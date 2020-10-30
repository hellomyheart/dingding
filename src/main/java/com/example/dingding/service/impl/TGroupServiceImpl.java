package com.example.dingding.service.impl;

import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.TGroupMapper;
import com.example.dingding.entity.TGroup;
import com.example.dingding.service.TGroupService;
@Service
public class TGroupServiceImpl extends ServiceImpl<TGroupMapper, TGroup> implements TGroupService{
@Autowired
private TGroupMapper tGroupMapper;
    @Override
    public ResponseResult add(String token, TGroup tGroup) {
        tGroup.setCreatetime(new Date());
        tGroup.setUId(1);
        int i = tGroupMapper.insert(tGroup);
        if(i>0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();

    }

    @Override
    public ResponseResult updateAll(String token, TGroup tGroup) {
        tGroup.getUId();
        tGroup.setGName(tGroup.getGName());
        tGroupMapper.updateAll(tGroup);

        return ResponseResult.ok();
    }


}
