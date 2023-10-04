package com.jianglisa.springbootmall.Dao;

import com.jianglisa.springbootmall.Model.Product;
import com.jianglisa.springbootmall.dto.ProductRequest;

public interface IProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
