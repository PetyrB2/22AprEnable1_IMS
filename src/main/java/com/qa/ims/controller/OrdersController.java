//package com.qa.ims.controller;
//
//import java.util.List;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import com.qa.ims.persistence.dao.ItemsDAO;
//import com.qa.ims.persistence.dao.OrdersDAO;
//import com.qa.ims.persistence.domain.Items;
//import com.qa.ims.persistence.domain.Orders;
//import com.qa.ims.persistence.domain.Customer;
//
//import com.qa.ims.utils.Utils;
//
//	/**
//	 * Takes in ORDER details for CRUD functionality
//	 *
//	 */

//	public class OrdersController  implements CrudController<Orders> {
//
//		public static final Logger LOGGER = LogManager.getLogger();
//
//		private OrdersDAO orderDAO;
//		private Utils utils;
//
//		
//		public OrdersController(OrdersDAO orderDAO, Utils utils) {
//			super();
//			this.orderDAO = orderDAO;
//			this.utils = utils;
//		}
//
//		/**
//		 * Reads all ORDERS to the logger
//		 */
//		@Override
//		public List<Orders> readAll() {
//			List<Orders> orders = orderDAO.readAll();
//			for (Orders order : orders) {
//				LOGGER.info(order);
//			}
//			return orders;
//		}
//
//		/**
//		 * Creates an ORDER by taking in user input
//		 */
//		@Override
////		public Orders create() {
////			LOGGER.info("Please enter an Order Number");
////			long orderNumber = utils.getLong();
////			LOGGER.info("Please Enter the ID of the first ITEM you wish to Order.");
////			long id = utils.getLong();
////			LOGGER.info("Please Enter the Quantity you require.");
////			long quantity = utils.getLong();
////			//DO SOMETHING ABOUT THIS !!!!
////			
////			double cost = utils.getDouble();
//////			Orders order = orderDAO.create(new Orders(orderNumber, id, cost, price));
////			LOGGER.info("Order Created...");
////			LOGGER.info("=".repeat(18));
//////			return order;
//		}

		/**
		 * Updates an existing ITEM on the ORDER by taking in user input BROKEN
		 */
//		@Override
//		public Orders update() {
//			LOGGER.info("Please enter the Order ID of the ORDER you would like to update");
//			Long orderID = utils.getLong();
//			LOGGER.info("Please enter an Order Number");
//			long orderNumber = utils.getLong();
//			LOGGER.info("Please enter the Product ID which you want to add.");
//			long id = utils.getLong();
//			
//			LOGGER.info("The price is: ");
////			double price = utils.getDouble(quantity*price);
//			Orders order1 = orderDAO.update(new Orders(orderID, orderNumber, Customer.id, ));
//			LOGGER.info("Order Updated...");
//			LOGGER.info("=".repeat(18));
//			return order1;
//		}
//
//		/**
//		 * Deletes an existing ORDER by the id of the ORDER
//		 * 
//		 * @return
//		 */
//		@Override
//		public int delete() {
//			LOGGER.info("Please enter the ID of the ORDER you would like to delete");
//			long orderID = utils.getLong();
//			try {
//				return OrdersDAO.delete(orderID);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//	}
