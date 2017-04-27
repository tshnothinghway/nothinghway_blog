package com.noth.thread.forkjoin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thway on 2017/4/25.
 * 随机生成产品列表
 */

public class ProductListGenerator {

    public List<Product> generate(int size) {

        List<Product> ret = new ArrayList<>();

        for (int i = 0 ; i < size ; i ++){
            Product product = new Product();
            product.setName("Product"+i);
            product.setPrice(10d);
            ret.add(product);
        }
        return ret;
    }

}
