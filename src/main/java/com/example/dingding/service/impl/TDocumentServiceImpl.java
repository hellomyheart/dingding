package com.example.dingding.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.TDocument;
import com.example.dingding.mapper.TDocumentMapper;
import com.example.dingding.service.TDocumentService;
@Service
public class TDocumentServiceImpl extends ServiceImpl<TDocumentMapper, TDocument> implements TDocumentService{

}
