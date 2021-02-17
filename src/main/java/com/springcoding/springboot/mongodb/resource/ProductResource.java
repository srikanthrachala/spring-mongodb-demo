package com.springcoding.springboot.mongodb.resource;

import com.springcoding.springboot.mongodb.data.Product;
import com.springcoding.springboot.mongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Resource Class for Product API end point/operations
 *
 * @author Srikanth
 */
@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    private ProductService productService;


    @GetMapping
    List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping
    Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    Product updateProduct(@RequestBody Product updateProduct, @PathVariable Long id) {
        return productService.updateProduct(updateProduct, id);
    }

    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
