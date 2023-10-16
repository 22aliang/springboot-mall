package com.jianglisa.springbootmall.Service.impl.impl;

import com.jianglisa.springbootmall.Dao.ProductDao;
import com.jianglisa.springbootmall.Model.Product;
import com.jianglisa.springbootmall.Service.impl.ProductService;
import com.jianglisa.springbootmall.constant.ProductCategory;
import com.jianglisa.springbootmall.dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductCategory category, String search) {
        return productDao.getProducts(category, search);
    }

    //實作方法
    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {

        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
