package com.samsung.sroki.service;

import com.samsung.sroki.domain.Product;

public interface ProductService {
    Product add(Product product);

    void delete(long id);

    Product update(long id, Product product);
}
