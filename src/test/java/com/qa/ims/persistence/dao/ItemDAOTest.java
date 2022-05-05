package com.qa.ims.persistence.dao;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {

	private final ItemsDAO DAO = new ItemsDAO();

	@Before
	public void setup() {
		DBUtils.connect();
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

//	@Test
//	public void testCreate() {
//		final Items created = new Items(2L, "Car", 1000.99);
//		assertEquals(created, DAO.create(created));
//	}

	@Test
	public void testReadAll() {
		List<Items> expected = new ArrayList<>();
		expected.add(new Items(1L, "Car", 1000.99));
		assertEquals(expected, DAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Items(1L, "Car", 1000.99), DAO.readLatest());
	}

	@Test
	public void testRead() {
		final long productID = 1L;
		assertEquals(new Items(productID, "Car", 1000.99), DAO.read(productID));
	}

	@Test
	public void testUpdate() {
		final Items updated = new Items(1L, "Car", 1000.99);
		assertEquals(updated, DAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals(1, DAO.delete(1));
	}
}

