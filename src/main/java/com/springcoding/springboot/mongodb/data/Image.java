package com.springcoding.springboot.mongodb.data;

import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "images")
public class Image {

    @Id
    private String id;
    private String name;
    private Binary content;
}
