package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.qa.ims.persistence.dao.OrdersDAO;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.persistence.domain.Orders;
import com.qa.ims.persistence.domain.Customer;

import com.qa.ims.utils.Utils;

	/**
	 * Takes in ORDER details for CRUD functionality
	 *
	 */

	public class OrdersController  implements CrudController<Orders> {

		public static final Logger LOGGER = LogManager.getLogger();

		private OrdersDAO orderDAO;
		private Utils utils;

		
		public OrdersController(OrdersDAO orderDAO, Utils utils) {
			super();
			this.orderDAO = orderDAO;
			this.utils = utils;
		
		}

		/**
		 * Reads all ORDERS to the logger
		 */
		@Override
		public List<Orders> readAll() {
			List<Orders> orders = orderDAO.readAll();
			for (Orders order : orders) {
				LOGGER.info(order);
				LOGGER.info("-".repeat(45));
			}
			return orders;
		}

		/**
		 * Creates an ORDER by taking in user input
		 */
		@Override
		public Orders create() {
			LOGGER.info("Please enter the ID of the Customer");
			long id = utils.getLong();
			LOGGER.info("Please Enter the ID of the ITEM you wish to Order.");
			long productID = utils.getLong();
			LOGGER.info("Please Enter the Quantity you require.");
			long quantity = utils.getLong();
			Orders order = orderDAO.create(new Orders(id, productID, quantity));
			LOGGER.info("Order Created...");
			LOGGER.info("=".repeat(18));
			return order;
		}

		/**
		 * Updates an existing ORDER by taking in user input ----AHHHHHHh
		 */
		@Override
		public Orders update() {
			LOGGER.info("Please enter the ID of the ORDER you would like to update");
			long orderID = utils.getLong();
			LOGGER.info("Please enter a Customer ID");
			long id = utils.getLong();
			LOGGER.info("Please enter the Product ID you wish to purchase.");
			long productID = utils.getLong();
			LOGGER.info("Enter the Quantity: ");
			long quantity = utils.getLong();
			Orders order = orderDAO.update(new Orders(orderID, id, productID, quantity));
			LOGGER.info("Order Updated...");
			LOGGER.info("=".repeat(18));
			return order;
		}

		/**
		 * Deletes an existing ORDER by the id of the ORDER
		 * 
		 * @return
		 */
//		@Override
//		public int delete() {
//			LOGGER.info("Please enter the ID of the ORDER you would like to delete");
//			long orderID = utils.getLong();
//			try {
//				return OrdersDAO.delete(OrderID);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		//Implemented different delete edited from Customer that WORKS !!!
		@Override
		public int delete() {
			LOGGER.info("Please enter the ID of the Order you would like to delete");
			Long orderID = utils.getLong();
			LOGGER.info("=".repeat(18));
			return orderDAO.delete(orderID);
			
		}
		
	}
