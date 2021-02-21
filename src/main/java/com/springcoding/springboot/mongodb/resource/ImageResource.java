package com.springcoding.springboot.mongodb.resource;

import com.springcoding.springboot.mongodb.data.Image;
import com.springcoding.springboot.mongodb.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Resource Class for Image API operations
 *
 * @author Srikanth
 */
@RestController
@RequestMapping("/images")
public class ImageResource {

    @Autowired
    private ImageService imageService;

    @PostMapping
    String uploadFile(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) throws IOException {
        return "redirect:/photos/" + imageService.uploadImage(name, file);
    }

    @GetMapping("/{id}")
    Image getImageById(@PathVariable String id) {
        return imageService.getImageById(id);
    }
}
