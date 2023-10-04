package com.jianglisa.springbootmall.Dao;

import com.jianglisa.springbootmall.Model.Product;

public interface IProductDao {
    Product getProductById(Integer productId);
}
