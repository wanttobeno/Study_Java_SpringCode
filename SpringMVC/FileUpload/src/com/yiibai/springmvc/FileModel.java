package com.yiibai.springmvc;

// https://www.yiibai.com/spring_mvc/springmvc_upload.html
import org.springframework.web.multipart.MultipartFile;

public class FileModel {
    private MultipartFile file;

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
