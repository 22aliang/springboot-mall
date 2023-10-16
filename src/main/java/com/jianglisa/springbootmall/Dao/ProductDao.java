package com.jianglisa.springbootmall.Dao;

import com.jianglisa.springbootmall.Model.Product;
import com.jianglisa.springbootmall.constant.ProductCategory;
import com.jianglisa.springbootmall.dto.ProductRequest;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
