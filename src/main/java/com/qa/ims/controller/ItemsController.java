	package com.qa.ims.controller;

	import java.util.List;
	import org.apache.logging.log4j.LogManager;
	import org.apache.logging.log4j.Logger;
	import com.qa.ims.persistence.dao.ItemsDAO;
	import com.qa.ims.persistence.domain.Items;
	import com.qa.ims.utils.Utils;

	/**
	 * Takes in ITEM details for CRUD functionality
	 *
	 */
	public class ItemsController implements CrudController<Items> {

		public static final Logger LOGGER = LogManager.getLogger();

		private ItemsDAO itemDAO;
		private Utils utils;

		public ItemsController(ItemsDAO itemDAO, Utils utils) {
			super();
			this.itemDAO = itemDAO;
			this.utils = utils;
		}

		/**
		 * Reads all ITEMS to the logger
		 */
		@Override
		public List<Items> readAll() {
			List<Items> items = itemDAO.readAll();
			for (Items item : items) {
			LOGGER.info("\t\r\n"  + item);
				LOGGER.info("-".repeat(45));
			}
			return items;
		}

		/**
		 * Creates an ITEM by taking in user input
		 */
		@Override
		public Items create() {
			LOGGER.info("Please enter a Product Name");
			String item = utils.getString();
			LOGGER.info("Please enter a Price for the Item");
			double cost = utils.getDouble();
			Items items = itemDAO.create(new Items(item, cost));
			LOGGER.info("Product Created...");
			LOGGER.info("=".repeat(18));
			return items;
		}

		/**
		 * Updates an existing ITEM by taking in user input
		 */
		@Override
		public Items update() {
			LOGGER.info("Please enter the ID of the ITEM you would like to update");
			Long productID = utils.getLong();
			LOGGER.info("Please enter a Product name");
			String item = utils.getString();
			LOGGER.info("Please enter a Price for the Product");
			double cost = utils.getDouble();
			Items product1 = itemDAO.update(new Items(productID, item, cost));
			LOGGER.info("Product Updated...");
			LOGGER.info("=".repeat(18));
			return product1;
		}

		/**
		 * Deletes an existing ITEM by the id of the PRODUCT itemID
		 * 
		 * @return
		 */
		@Override
		public int delete() {
			LOGGER.info("Please enter the ID of the Product you would like to delete");
			Long productID = utils.getLong();
			LOGGER.info("Product Deleted...");
			LOGGER.info("=".repeat(18));			
			return itemDAO.delete(productID);
		}

	}
