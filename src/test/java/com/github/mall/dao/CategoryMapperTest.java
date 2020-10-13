package com.github.mall.dao;

import com.github.mall.MallApplicationTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CategoryMapperTest extends MallApplicationTests {
    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void findById() {
        Assertions.assertNotNull(categoryMapper.findById(100001));
    }

    @Test
    void queryById() {
        Assertions.assertNotNull(categoryMapper.queryById(100001));
    }
}