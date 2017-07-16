package com.nagai.sample.api.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nagai.sample.api.entity.Order;

@Service
public class OrderServiceImpl implements OrderService{
	
	private final static Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public void save(Order order) {
		LOGGER.info("save order.orderId =>{}",order.getId());
	}

	@Override
	public List<Order> list() {
		List<Order> orders = new ArrayList<>();
		for(int i=0;i<100;i++){
			Order order = new Order();
			order.setId(100000l+i);
			order.setUserId("defs9k2opsd1s23s1nml");
			order.setPrice(new BigDecimal(45l+i));
			order.setCreateDate(new Date());
			order.setPaidDate(new Date());
			orders.add(order);
		}
		return orders;
	}

	@Override
	public Order findById(Long id) {
		Order order = new Order();
		order.setId(id);
		order.setUserId("defs9k2opsd1s23s1nml");
		order.setPrice(new BigDecimal(121.1));
		order.setCreateDate(new Date());
		order.setPaidDate(new Date());
		return order;
	}

	@Override
	public void delete(Long id) {
		LOGGER.info("delet order.orderId =>{}",id);
	}
}
