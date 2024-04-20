package com.samsung.sroki.service.Impl;

import com.samsung.sroki.dao.ProductDao;
import com.samsung.sroki.domain.Product;
import com.samsung.sroki.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;

    @Override
    public Product add(Product product) {
        return productDao.save(product);
    }

    @Override
    public void delete(long id) {
        Optional<Product> optionalProduct = productDao.findById(id);
        if (!optionalProduct.isPresent()) throw new RuntimeException();

        productDao.deleteById(optionalProduct.get().getId());
    }

    @Override
    public Product update(long id, Product product) {
        Optional<Product> optionalProduct = productDao.findById(id);
        if (!optionalProduct.isPresent()) throw new RuntimeException();

        Product updatedProduct = optionalProduct.get();
        updatedProduct.setName(product.getName());
        updatedProduct.setFreshnessId(product.getFreshnessId());
        updatedProduct.setData(product.getData());

        return productDao.save(updatedProduct);
    }
}
