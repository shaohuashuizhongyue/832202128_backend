package com.controller.admin;

import com.dto.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RequestMapping("/admin")
@RestController
public class UploadController {

    private static final Logger LOG = LoggerFactory.getLogger(UploadController.class);

    public static final String BUSINESS_NAME = "文件上传";

    @Value("${file.domain}")
    private String FILE_DOMAIN;

    @Value("${file.path}")
    private String FILE_PATH;

    @RequestMapping("/upload")
    public ResponseDto upload(@RequestParam MultipartFile file)  {
        LOG.info("上传文件开始");
        LOG.info(file.getOriginalFilename());
        LOG.info(String.valueOf(file.getSize()));
        // 保存文件到本地
        String fileName = file.getOriginalFilename();

        //如果文件夹不存在则创建
        File targetFile = new File(FILE_PATH, fileName );
        if (!targetFile.exists()) {
            targetFile.mkdir();
        }
        String fullPath = FILE_PATH + fileName;
        File dest = new File(fullPath);
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOG.info(dest.getAbsolutePath());

        LOG.info("保存文件记录开始");
        ResponseDto responseDto = new ResponseDto();
        //responseDto.setContent(FILE_DOMAIN +fileName);
        responseDto.setContent(fileName);
        System.out.println("path=="+responseDto.getContent());
        return responseDto;
    }
}
