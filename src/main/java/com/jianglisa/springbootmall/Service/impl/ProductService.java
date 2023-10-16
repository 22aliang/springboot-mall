package com.jianglisa.springbootmall.Service.impl;

import com.jianglisa.springbootmall.Dao.ProductQueryParams;
import com.jianglisa.springbootmall.Model.Product;
import com.jianglisa.springbootmall.dto.ProductRequest;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
