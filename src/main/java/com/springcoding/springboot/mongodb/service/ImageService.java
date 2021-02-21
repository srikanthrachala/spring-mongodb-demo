package com.springcoding.springboot.mongodb.service;

import com.springcoding.springboot.mongodb.dao.ImageRepository;
import com.springcoding.springboot.mongodb.data.Image;
import com.springcoding.springboot.mongodb.exception.ImageNotFoundException;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image getImageById(String id) {
        return imageRepository.findById(id).orElseThrow(() -> new ImageNotFoundException(id));
    }

    public String uploadImage(String name, MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(name);
        image.setContent(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        return imageRepository.insert(image).getId();
    }

}
