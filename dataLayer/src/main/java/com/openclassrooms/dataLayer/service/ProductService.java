package com.openclassrooms.dataLayer.service;

import com.openclassrooms.dataLayer.model.Product;
import com.openclassrooms.dataLayer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }
    public Iterable<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }
    public Optional<Product> getProductById(Integer id) {
        return productRepository.findById(id);
    }
    public Product saveProduct(Product p){
        return productRepository.save(p);
    }
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
    }
}
