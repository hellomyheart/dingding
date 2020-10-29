package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.Sign;
import com.example.dingding.mapper.SignMapper;
import com.example.dingding.service.SignService;
@Service
public class SignServiceImpl extends ServiceImpl<SignMapper, Sign> implements SignService{

}
