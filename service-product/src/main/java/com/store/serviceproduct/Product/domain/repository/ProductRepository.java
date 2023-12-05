package com.store.serviceproduct.Product.domain.repository;

import com.store.serviceproduct.Category.domain.entity.Category;
import com.store.serviceproduct.Product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
