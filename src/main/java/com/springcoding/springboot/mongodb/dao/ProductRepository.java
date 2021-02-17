package com.springcoding.springboot.mongodb.dao;

import com.springcoding.springboot.mongodb.data.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Long> {

}
