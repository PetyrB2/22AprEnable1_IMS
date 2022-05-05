package com.qa.ims.persistence.domain;

public class Orders {

	private Long orderID;
	private Long orderNumber;
	private Long id;
	private Long itemID;
	private double price;


	public Orders(Long orderNumber, Long id, Long itemID, double price) {
		this.setorderNumber(orderNumber);
	}

	public Orders(Long orderID, Long orderNumber, Long id, Long itemID, double price) {
		this.setOrderId(orderID);
		this.setorderNumber(orderNumber);
		this.setId(id);
		this.setitemID(itemID);
		this.setprice(price);
	}
// Get & Set OrderID
	public Long getOrderId() {
		return orderID;
	}

	public void setOrderId(Long orderID) {
		this.orderID = orderID;
	}

// Get & Set orderNumber
	public Long getorderNumber() {
		return orderNumber;
	}

	public void setorderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}

// Get & Set id (from customers table)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
// Get & Set ItemID (from Items table)
	public Long getitemID() {
		return itemID;
	}

	public void setitemID(Long itemID) {
		this.itemID = itemID;
	}
	
// Get & Set price
		public double getprice() {
			return price;
		}

		public void setprice(double price) {
			this.price = price;
		}
	
	@Override
	public String toString() {
		return "\n\tOrder ID: " + orderID + "\n\tOrder Number: " + orderNumber + "\n\tCustomer ID: " + id + "\n\tItem ID: " + itemID + "\n\tPrice: " + price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
// cannot hashCode price
//		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		if (getorderNumber() == null) {
			if (other.getorderNumber() != null)
				return false;
		} else if (!getorderNumber().equals(other.getorderNumber()))
			return false;
		if (orderID == null) {
			if (other.orderID != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (itemID == null) {
			if (other.itemID != null)
				return false;
		} else if (!itemID.equals(other.itemID))
			return false;

// An Issue with price here as above
//
//		if (price == null) {
//			if (other.price != null)
//				return false;
//		} else if (!price.equals(other.price))
//			return false;
		return true;
	}

}
