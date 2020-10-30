package com.example.dingding.service.impl;

import com.example.dingding.third.AliOssUtil;
import com.example.dingding.util.StrUtil;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.TDocument;
import com.example.dingding.mapper.TDocumentMapper;
import com.example.dingding.service.TDocumentService;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TDocumentServiceImpl extends ServiceImpl<TDocumentMapper, TDocument> implements TDocumentService {

    @Autowired
    private TDocumentMapper tDocumentMapper;

    @Override
    public ResponseResult save(MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fillname = rename(file.getOriginalFilename());
            String url = AliOssUtil.uploadByte(AliOssUtil.BucketName, fillname, file.getBytes());
            if (StrUtil.checkNoEmpty(url)){
                TDocument tDocument=new TDocument();
                Date date=new Date();
                tDocument.setCreatetime(date);
                tDocument.setUpdatetime(date);
                tDocument.setDAddress(url);

                //TODO:后面修改
                tDocument.setUId(1);
                //TODO：后面修改
                tDocument.setDName(fillname);
                tDocumentMapper.insert(tDocument);
                return ResponseResult.ok();
            }


        }
        return ResponseResult.fail();
    }


    private String rename(String filename) {
        if (filename.length() > 20) {
            filename = filename.substring(filename.length() - 20);
        }
        return UUID.randomUUID().toString().replaceAll("-", "") + filename;
    }

}
