package com.example.dingding.controller;

import com.example.dingding.entity.TDocument;
import com.example.dingding.service.TDocumentService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @description 文档控制器
 * @className: DocumentController
 * @package: com.example.dingding.controller
 * @author: Stephen Shen
 * @date: 2020/10/30 上午10:00
 */
@RestController
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    TDocumentService tDocumentService;

    /**
     * 上传文档
     * @param file
     * @return
     */
    @PostMapping("add")
    public ResponseResult add(@RequestParam("file") MultipartFile file) throws IOException {
        return tDocumentService.save(file);
    }

    /**
     * 修改文档
     * @param file
     * @param fileId
     * @return
     * @throws IOException
     */
    @PostMapping("update")
    public ResponseResult update(@RequestParam("file") MultipartFile file,Integer fileId) throws IOException {
        return tDocumentService.update(file,fileId);
    }

    /**
     * 删除文档
     * @param id
     * @return
     */
    @GetMapping("delete/{id}")
    public ResponseResult delete(@PathVariable("id") Integer id){
        TDocument tDocument = new TDocument();
        tDocument.setStatus(0);
        tDocument.setId(id);

        boolean b = tDocumentService.updateById(tDocument);
        if (b){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }


}
