package com.EAD2.ProductCatalog.Repository;

import com.EAD2.ProductCatalog.Data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAllByCategory(String category);

    public List<Product> findAllByName(String name);
}
