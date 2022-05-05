package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.qa.ims.persistence.domain.Items;
import com.qa.ims.utils.DBUtils;

public class ItemsDAO implements Dao<Items> {

	public static final Logger LOGGER = LogManager.getLogger();
	private static final List<Items> Items = null;

	@Override
	public Items modelFromResultSet(ResultSet resultSet) throws SQLException {
		long productID = resultSet.getLong("productID");
		String item = resultSet.getString("item");
		double cost = resultSet.getDouble("cost");
		return new Items(productID, item, cost);
	}

	/**
	 * READ all ITEMS from the database
	 * 
	 * @return A list of ITEMS
	 */
	@Override
	public List<Items> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM Items");) {
			List<Items> Items = new ArrayList<>();
			while (resultSet.next()) {
				Items.add(modelFromResultSet(resultSet));
			}
			return Items;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}

	public Items readLatest() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM Items ORDER BY productID DESC LIMIT 1");) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Creates an ITEM in the database
	 * 
	 * @param Items - takes in an item (name of item) and cost object. itemID will be ignored
	 */
	@Override
	public Items create(Items item) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO Items(item, cost) VALUES (?, ?)");) {
			statement.setString(1, item.getitem());
			statement.setDouble(2, item.getcost());
			statement.executeUpdate();
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	@Override
	public Items read(Long productID) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("SELECT * FROM Items WHERE productID = ?");) {
			statement.setLong(1, productID);
			try (ResultSet resultSet = statement.executeQuery();) {
				resultSet.next();
				return modelFromResultSet(resultSet);
			}
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Updates an ITEM in the database
	 * 
	 * @param customer - takes in an Items object, the productID field will be used
	 *                 to update that Item in the database
	 * @return
	 */
	@Override
	public Items update(Items item) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("UPDATE Items SET item = ?, cost = ? WHERE productID = ?");) {
			statement.setString(1, item.getitem());
			statement.setDouble(2, item.getcost());
			statement.setLong(3, item.getproductID());
			statement.executeUpdate();
			return read(item.getproductID());
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	/**
	 * Deletes an ITEM from the database
	 * 
	 * @param productID - productID of the customer
	 */
	@Override
	public int delete(long productID) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("DELETE FROM Items WHERE productID = ?");) {
			statement.setLong(1, productID);
			return statement.executeUpdate();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}

}
