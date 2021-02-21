package com.springcoding.springboot.mongodb.exception;

public class ImageNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ImageNotFoundException(String id) {
        super("Could not find image with id " + id);
    }
}
