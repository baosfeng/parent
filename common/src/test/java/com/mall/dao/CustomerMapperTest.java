package com.mall.dao;

import com.mall.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/applicationContext.xml")
public class CustomerMapperTest {

	@Autowired
	private CustomerMapper customerMapper;
	@Test
	public void testInsert() {
		Customer customer = new Customer();
		customer.setUserName("admin");
		customer.setPassword("abc123");
		customer.setDisplayName("admin");
		customer.setRegisterTime(new Date());
		int insert = customerMapper.insert(customer);
		assertEquals(1, insert);
	}
	@Test
	public void selectTest() {
		Customer customer = customerMapper.selectByPrimaryKey(1);
		assertNotEquals(null, customer);
	}
	@Test
	public void deleteTest() {
		int i = customerMapper.deleteByPrimaryKey(4);
		assertEquals(1, i);
	}
}