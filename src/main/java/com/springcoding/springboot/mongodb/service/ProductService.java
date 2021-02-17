package com.springcoding.springboot.mongodb.service;

import com.springcoding.springboot.mongodb.dao.ProductRepository;
import com.springcoding.springboot.mongodb.data.Product;
import com.springcoding.springboot.mongodb.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product createProduct(Product product) {
        product.setId(sequenceGeneratorService.generateSequence(Product.SEQUENCE_NAME));
        return repository.insert(product);
    }

    public Product getProductById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product updateProduct(Product updateProduct, Long id) {

        return repository.findById(id).map(product -> {
            product.setName(updateProduct.getName());
            product.setPrice(updateProduct.getPrice());
            return repository.save(product);
        }).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

}
