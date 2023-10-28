package com.EAD2.ProductCatalog.Service;

import com.EAD2.ProductCatalog.Data.Product;
import com.EAD2.ProductCatalog.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor   //basically create a constructor for dependency injection
@Slf4j
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addProduct (Product product) {
        log.info("Product {} is saved", product.getId());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct (Long productId) {
        productRepository.deleteById(productId);
        log.info("Product {} is deleted", productId);
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products;
    }

    @Override
    public List<Product> getAllProductByCategory(String category)

    {
        List<Product> products = productRepository.findAllByCategory(category);
        return products;

    }

    @Override
    public List<Product> getAllProductsByName(String name) {
        List<Product> products = productRepository.findAllByName(name);
        return products;

    }

    @Override
    public Product getProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));

        return product;
    }

}
