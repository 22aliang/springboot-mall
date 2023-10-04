package com.jianglisa.springbootmall.Service.impl.impl;

import com.jianglisa.springbootmall.Dao.IProductDao;
import com.jianglisa.springbootmall.Model.Product;
import com.jianglisa.springbootmall.Service.impl.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao iproductDao;

    //實作方法
    @Override
    public Product getProductById(Integer productId) {
        return iproductDao.getProductById(productId);
    }
}
