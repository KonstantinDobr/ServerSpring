package com.samsung.sroki.controller;

import com.samsung.sroki.domain.Product;
import com.samsung.sroki.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/product")
    public Product add(@RequestBody Product product) {
        return productService.add(product);
    }

    @DeleteMapping("/product/{id}")
    public void delete(@PathVariable long id) {
        productService.delete(id);
    }

    @PostMapping("/product/{id}")
    public Product update(@PathVariable long id, @RequestBody Product product) {
        return productService.update(id, product);
    }
}
