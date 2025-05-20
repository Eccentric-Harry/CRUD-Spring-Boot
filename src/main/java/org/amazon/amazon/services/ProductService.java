package org.amazon.amazon.services;

import org.amazon.amazon.models.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.addAll(Arrays.asList(
                new Product(101, "iPhone 16", 100000),
                new Product(102, "Samsung S25", 150000)
        ));
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id){
        for(Product product: products){
            if(product.getProductId() == id){
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product){
        int index = -1;
        for(int i = 0; i < products.size(); i++){
            if(product.getProductId() == products.get(i).getProductId()){
                index = i;
            }
        }
        products.set(index, product);
    }

    public void deleteProductById(int id){
        int index = -1;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getProductId() == id){
                index = i;
                break;
            }
        }
        products.remove(index);
    }
}
