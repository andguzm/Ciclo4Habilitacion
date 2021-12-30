/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usa.habilitacion.repository;

import com.usa.habilitacion.model.Product;
import com.usa.habilitacion.repository.crudrepository.ProductCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Andrea Guzman
 */
@Repository
public class ProductRepository {
    @Autowired
    private ProductCrudRepository productRepository;
    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Optional<Product> getProduct(String reference){
        return productRepository.findById(reference);
    }
    public Product create(Product product){
        return productRepository.save(product);
    }
    public void update(Product product){
        productRepository.save(product);
    }
    public void delete(Product product){
        productRepository.delete(product);
    }
    public List<Product> findByDescriptionContainingIgnoreCase(String description){
        return productRepository.findByDescriptionContainingIgnoreCase(description);
    }
    public List<Product> findByPriceLessThanEqual(Double price){
        return productRepository.findByPriceLessThanEqual(price);
    }
}
