package com.nagai.sample.api.service;

import java.util.List;

import com.nagai.sample.api.entity.Order;

public interface OrderService {

	void save(Order order);
	
	List<Order> list();
	
	Order findById(Long id);
	
	void delete(Long id);
}
