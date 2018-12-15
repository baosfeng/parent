package com.mall.dao;

import com.mall.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class CustomerMapperTest {

	@Autowired
	private CustomerMapper customerMapper;

	@Test
	public void selectTest() {
		Customer customer = customerMapper.selectByPrimaryKey(1);
		System.out.println(customer);
	}

}