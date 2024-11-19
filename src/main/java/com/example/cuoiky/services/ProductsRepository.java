package com.example.cuoiky.services;

import com.example.cuoiky.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductsRepository extends JpaRepository<Product, Integer> {


}

