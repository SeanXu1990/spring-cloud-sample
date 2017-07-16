package com.nagai.sample.api.test.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.nagai.sample.api.entity.Order;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {
	
	@Autowired
	private TestRestTemplate restTemplate;

	/**
	 * 
	 * @author Sean Xu
	 * @Description: TestRestTemplate进行单元测试
	 * @date 2017年7月14日 下午8:11:51 void
	 * @throws
	 */
	@Test
	public void addOrderTest(){
		Order  order = this.restTemplate.getForObject("/orders/1123123", Order.class);
		Assert.isTrue(1123123l == order.getId(), "same");
				
	}
}
