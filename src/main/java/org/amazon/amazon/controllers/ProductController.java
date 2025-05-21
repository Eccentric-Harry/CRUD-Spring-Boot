package org.amazon.amazon.controllers;

import org.amazon.amazon.models.Product;
import org.amazon.amazon.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        Product product = productService.getProductById(id);
        if (product == null) {
            throw new RuntimeException("Product with ID " + id + " not found");
        }
        return product;
    }

    @PostMapping
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "Product added successfully";
    }

    @PutMapping("/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody Product updatedProduct){
        productService.updateProduct(updatedProduct);
        return "Product updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteProductById(@PathVariable int id) {
        productService.deleteProductById(id);
        return "Product deleted successfully";
    }
}
