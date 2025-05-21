package org.amazon.amazon.services;

import org.amazon.amazon.models.Product;
import org.amazon.amazon.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {


    @Autowired
    ProductRepo repo;


//    private final List<Product> products = new ArrayList<>();
//
//    public ProductService() {
//        products.addAll(Arrays.asList(
//                new Product(101, "iPhone 16", 100000),
//                new Product(102, "Samsung S25", 150000)
//        ));
//    }


    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product){
        repo.save(product);
    }

    public void deleteProductById(int id){
        repo.deleteById(id); 
    }
}
