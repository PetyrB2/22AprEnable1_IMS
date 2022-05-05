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

import com.qa.ims.controller.ItemsController;
import com.qa.ims.persistence.dao.ItemsDAO;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)

public class ItemsControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private ItemsDAO dao;

	@InjectMocks
	private ItemsController controller;

	//edited Mockito.times(2) to Mockito.times(3) to 1 and added getDouble for cost
	@Test
	public void testCreate() {
		
		final String ITEM = "Car";
		double COST = 1000.99;
		final Items created = new Items(ITEM, COST);

		Mockito.when(utils.getString()).thenReturn(ITEM);
		Mockito.when(utils.getDouble()).thenReturn(COST);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test
	public void testReadAll() {
		List<Items> Items = new ArrayList<>();
		Items.add(new Items(1L, "Car", 1000.99));

		Mockito.when(dao.readAll()).thenReturn(Items);

		assertEquals(Items, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}
	
	//returned Mockito.times(3) to Mockito.times(2) to suit ITEMS test
	@Test
	public void testUpdate() {
		Items updated = new Items(1L, "Car", 1000.99);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(updated.getitem());
		Mockito.when(this.utils.getDouble()).thenReturn(updated.getcost());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long productID = 1L;

		Mockito.when(utils.getLong()).thenReturn(productID);
		Mockito.when(dao.delete(productID)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(productID);
	}

}

