package com.jacademy.robotics.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jacademy.robotics.entity.Products;

@Repository
public interface ProductRepository extends CrudRepository <Products, Integer>{

}
