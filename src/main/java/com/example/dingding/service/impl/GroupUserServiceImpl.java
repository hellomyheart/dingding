package com.example.dingding.service.impl;

import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.mapper.GroupUserMapper;
import com.example.dingding.entity.GroupUser;
import com.example.dingding.service.GroupUserService;
@Service
public class GroupUserServiceImpl extends ServiceImpl<GroupUserMapper, GroupUser> implements GroupUserService{
    @Autowired
    private GroupUserMapper groupUserMapper;
    @Override
    public ResponseResult add(String token, GroupUser groupUser) {
        groupUser.getUId();
        groupUser.setCreatetime(new Date());
        int i = groupUserMapper.insert(groupUser);
        if(i>0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult deleteById(String token, Integer uId) {
        int i = groupUserMapper.deleteById(uId);
        if (i>0){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();

    }
}
