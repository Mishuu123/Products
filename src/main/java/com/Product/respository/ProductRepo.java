package com.Product.Respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product.Entity.Product;
import com.Product.Model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

 public Optional<Product> findById(Integer id);
 public Product save(Product product);
 public List<Product> findAll();
public void save(ProductModel product);

}
