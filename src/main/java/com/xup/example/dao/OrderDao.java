package com.xup.example.dao;

import com.xup.example.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {

    public List<Order> selectAll();

    public List<Order> selectByCondition(Order order);

    public void insert(Order order);

}
