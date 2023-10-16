package com.jianglisa.springbootmall.Dao;

import com.jianglisa.springbootmall.constant.ProductCategory;

public class ProductQueryParams {
    // 查詢條件參數整理成 class 好維護擴展
    private ProductCategory category;
    private String search;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
