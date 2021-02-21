package com.springcoding.springboot.mongodb.dao;

import com.springcoding.springboot.mongodb.data.Image;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<Image, String> {
}
