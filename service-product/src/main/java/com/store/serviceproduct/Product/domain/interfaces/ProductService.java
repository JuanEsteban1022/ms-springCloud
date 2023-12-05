package com.store.serviceproduct.Product.domain.interfaces;

import com.store.serviceproduct.Category.domain.entity.Category;
import com.store.serviceproduct.Product.domain.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();

    public Product getProduct(Long id);

    public Product createProduct(Product product);

    public Product updateProduct(Product product);

    public Product deleteProduct(Long id);

    public List<Product> findByCategory(Category category);

    public Product updateStock(Long id, Double quantity);
}
