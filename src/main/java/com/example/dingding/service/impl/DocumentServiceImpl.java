package com.example.dingding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
import com.example.dingding.mapper.DocumentMapper;
import com.example.dingding.entity.Document;
import com.example.dingding.service.DocumentService;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DocumentServiceImpl extends ServiceImpl<DocumentMapper, Document> implements DocumentService {

    @Autowired
    private DocumentMapper documentMapper;

    @Override
    public ResponseResult add(MultipartFile multipartFile) throws IOException {
        if (!multipartFile.isEmpty()) {
            String fillname = rename(multipartFile.getOriginalFilename());
            String url = AliOssUtil.uploadByte(AliOssUtil.BucketName, fillname, multipartFile.getBytes());
            if (StrUtil.checkNoEmpty(url)){
                Document document =new Document();

                Date date=new Date();
                document.setCreatetime(date);
                document.setUpdatetime(date);
                document.setDAddress(url);
                //TODO:后面修改
                document.setUId(1);

                //TODO： 文件名需要修改
                document.setDName(fillname);
                documentMapper.insert(document);
                return ResponseResult.ok();
            }
        }
        return ResponseResult.fail();
    }

    @Override
    public ResponseResult update(MultipartFile file,String filename) throws IOException {
        if (!file.isEmpty()) {
            String fillname = rename(file.getOriginalFilename());
            String url = AliOssUtil.uploadByte(AliOssUtil.BucketName, fillname, file.getBytes());
            if (StrUtil.checkNoEmpty(url)){
                Document document =new Document();

                Date date=new Date();
                document.setCreatetime(date);
                document.setUpdatetime(date);
                document.setDAddress(url);
                //TODO:后面修改
                document.setUId(1);

                document.setDName(fillname);
                QueryWrapper<Document> queryWrapper=new QueryWrapper<>();
                queryWrapper.eq(Document.COL_D_NAME, filename);
                //TODO:后面需要修改（用户ID现在是死的）
                queryWrapper.eq(Document.COL_U_ID,1);
                documentMapper.update(document,queryWrapper);
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
