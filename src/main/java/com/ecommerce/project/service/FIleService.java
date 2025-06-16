package com.ecommerce.project.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FIleService {
    String uploadImage(String path, MultipartFile file) throws IOException;
}
