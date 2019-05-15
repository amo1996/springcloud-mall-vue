package com.mall.springcloudorderone.dao;


import com.mall.springcloudorderone.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TestDao {

    @Select("select * from order_test where id = #{id}")
    Test findById(Long id);
}
