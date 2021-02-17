package com.springcoding.springboot.mongodb.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "products")
public class Product {
    @Transient
    public static final String SEQUENCE_NAME = "products_sequence";

    @Id
    private Long id;
    private String name;
    private Double price;
}
