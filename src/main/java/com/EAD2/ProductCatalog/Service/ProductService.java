package com.EAD2.ProductCatalog.Service;

import com.EAD2.ProductCatalog.Data.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);
    public void deleteProduct(Long productId);
    public List<Product> getAllProducts();
    public List<Product> getAllProductByCategory(String category);
    public Product getProductById(Long id);
    public List<Product> getAllProductsByName(String name);

}
