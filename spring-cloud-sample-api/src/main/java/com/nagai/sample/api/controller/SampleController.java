package com.nagai.sample.api.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagai.sample.api.entity.Order;
import com.nagai.sample.api.service.OrderService;

@RestController
public class SampleController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/")
	public String helloWorld(){
		return "HELLO WORLD ";
	}
	
	@RequestMapping(value="/orders",method=RequestMethod.POST)
	public Map<String,Object> saveOrder(@RequestBody Order order){
		orderService.save(order);
		Map<String,Object> result = new LinkedHashMap<>();
		result.put("success", true);
		result.put("message", "operation successd.");
		return result;
	}
	
	@RequestMapping(value="/orders/{orderId}",method=RequestMethod.GET)
	public Order findById(@PathVariable(value="orderId") Long orderId){
		return orderService.findById(orderId);
	}
	
	
	
}
