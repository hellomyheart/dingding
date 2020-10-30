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
        String fillname = file.getOriginalFilename();
        String newFillname = rename(file.getOriginalFilename());
        String url = AliOssUtil.uploadByte(AliOssUtil.BucketName, newFillname, file.getBytes());
        if (StrUtil.checkNoEmpty(url)) {
            TDocument tDocument = new TDocument();
            Date date = new Date();
            tDocument.setCreatetime(date);
            tDocument.setUpdatetime(date);
            tDocument.setDAddress(url);
            tDocument.setStatus(1);

            //TODO:后面修改
            tDocument.setUId(1);
            //TODO：后面修改
            tDocument.setDName(fillname);
//            tDocumentMapper.insert(tDocument);
            boolean save = this.save(tDocument);
            if (save){
                return ResponseResult.ok();
            }

        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult update(MultipartFile file, Integer fileId) throws IOException {

        TDocument oldDocument = this.getById(fileId);
        //判断文件已存在（数据库）
        if (oldDocument != null) {

            String newFillname = rename(file.getOriginalFilename());
            boolean b = AliOssUtil.delObj(AliOssUtil.BucketName, oldDocument.getDName());
            if (!b){
                return ResponseResult.fail();
            }
            String url = AliOssUtil.uploadByte(AliOssUtil.BucketName, newFillname, file.getBytes());
            if (StrUtil.checkNoEmpty(url)){
                oldDocument.setDAddress(url);
                oldDocument.setUpdatetime(new Date());
                boolean save = this.updateById(oldDocument);
                if (save){
                    return ResponseResult.ok();
                }
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
