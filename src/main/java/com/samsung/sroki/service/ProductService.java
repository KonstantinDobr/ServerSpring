package com.samsung.sroki.service;

import com.samsung.sroki.domain.Product;

public interface ProductService {

    Product get(long id);

    Product save(Product product);

    void delete(long id);

    Product update(Product product);
}
