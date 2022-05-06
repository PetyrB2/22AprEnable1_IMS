	package com.qa.ims.controllers;

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

	public class OrdersControllerTest {


		@Mock
		private Utils utils;

		@Mock
		private OrdersDAO dao;

		@InjectMocks
		private OrdersController controller;

		//testCreate Controller ORDERS
		@Test
		public void testCreate() {
			
			final long id = 1;
			long productID = 10;
			long quantity = 200;
			final Orders created = new Orders(id, productID, quantity);

//			Mockito.when(utils.getLong()).thenReturn(id);
//			Mockito.when(utils.getLong()).thenReturn(productID);
//			Mockito.when(utils.getLong()).thenReturn(quantity);
//			Mockito.when(dao.create(created)).thenReturn(created);

//			assertEquals(created, controller.create());
//
//			Mockito.verify(utils, Mockito.times(3)).getLong();
//			Mockito.verify(dao, Mockito.times(1)).create(created);
		}

		@Test
		public void testReadAll() {
			List<Orders> Orders = new ArrayList<>();
			Orders.add(new Orders(1, 10, 200));
			Mockito.when(dao.readAll()).thenReturn(Orders);
			assertEquals(Orders, controller.readAll());
			Mockito.verify(dao, Mockito.times(1)).readAll();
		}
		
//		//test UPDATE ORDER
//		@Test
//		public void testUpdate() {
//			Orders updated = new Orders(1, 10, 200);
//
//			Mockito.when(this.utils.getLong()).thenReturn((long) 1);
//			Mockito.when(this.utils.getLong()).thenReturn(updated.getproductID());
//			Mockito.when(this.utils.getLong()).thenReturn(updated.getquantity());
//			Mockito.when(this.dao.update(updated)).thenReturn(updated);
//
//			assertEquals(updated, this.controller.update());
//
//			Mockito.verify(this.utils, Mockito.times(3)).getLong();
//			Mockito.verify(this.dao, Mockito.times(1)).update(updated);
//		}

		//test DELETE ORDER
		@Test
		public void testDelete() {
			final long orderID = 1;

			Mockito.when(utils.getLong()).thenReturn(orderID);
			Mockito.when(dao.delete(orderID)).thenReturn(1);

			assertEquals(1, this.controller.delete());

			Mockito.verify(utils, Mockito.times(1)).getLong();
			Mockito.verify(dao, Mockito.times(1)).delete(orderID);
		}

	}

