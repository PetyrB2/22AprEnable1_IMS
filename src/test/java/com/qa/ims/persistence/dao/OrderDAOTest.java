package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrdersController;
import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)

public class OrderDAOTest {

	private final OrdersDAO DAO = new OrdersDAO();
	
	@Mock
	private Utils utils;

	@Mock
	private OrdersDAO dao;

	@InjectMocks
	private OrdersController controller;




//	@Test
//	public void testCreate() {
//		final Orders created = new Orders(1, 10, 200);
//		assertEquals(created, DAO.create(created));
//	}
//
//	@Test
//	public void testReadAll() {
//		List<Orders> expected = new ArrayList<>();
//		expected.add(new Orders(1, 10, 200));
//		assertEquals(expected, DAO.readAll());
//	}
//
//	@Test
//	public void testReadLatest() {
//		assertEquals(new Orders(1, 10, 200), DAO.readLatest());
//	}
//
//	@Test
//	public void testRead() {
//		final long orderID = 0;
//		assertEquals(new Orders(orderID, 10, 200), DAO.read(orderID));
//	}

//	@Test
//	public void testUpdate() {
//		final Orders updated = new Orders(1, 10, 200);
//		assertEquals(updated, DAO.update(updated));
//
//	}

	@Test
	public void testDelete() {
		assertEquals(0, DAO.delete(0));
	}
}