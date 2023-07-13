package com.rai.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.rai.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
