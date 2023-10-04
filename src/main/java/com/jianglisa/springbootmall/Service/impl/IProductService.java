package com.jianglisa.springbootmall.Service.impl;

import com.jianglisa.springbootmall.Model.Product;
import com.jianglisa.springbootmall.dto.ProductRequest;

public interface IProductService {
    //根據ID取得數據
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
