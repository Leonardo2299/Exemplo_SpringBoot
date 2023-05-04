package com.leoteste00.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leoteste00.demo.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{
	


}
