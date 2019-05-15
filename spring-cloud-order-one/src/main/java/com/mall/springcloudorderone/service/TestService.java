package com.mall.springcloudorderone.service;


import com.mall.springcloudorderone.dao.TestDao;
import com.mall.springcloudorderone.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    TestDao testDao;

    public Test findById(Long id) {
          return testDao.findById(id);
    }
}
