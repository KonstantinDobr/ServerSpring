package com.samsung.sroki.controller;

import com.samsung.sroki.domain.Product;
import com.samsung.sroki.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/get/{id}")
    public Product get(long id) {
        return productService.get(id);
    }

    @PostMapping("/product/save")
    public Product add(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/product/delete/{id}")
    public void delete(@PathVariable long id) {
        productService.delete(id);
    }

    @PostMapping("/product/update/")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }
}
