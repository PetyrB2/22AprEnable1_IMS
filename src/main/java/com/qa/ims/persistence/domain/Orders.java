package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Orders {

	private Long orderID;
	private Long id;
	private Long productID;
	private Long quantity;

	public Orders(Long orderID, Long id, Long productID, Long quantity) {
		this.setOrderId(orderID);
		this.setId(id);
		this.setproductID(productID);
		this.setquantity(quantity);
	}
	public Orders(Long id, Long productID, Long quantity) {
		this.setId(id);
		this.setproductID(productID);
		this.setquantity(quantity);
	}
	
// Get & Set OrderID
	public Long getOrderId() {
		return orderID;
	}

	public void setOrderId(Long orderID) {
		this.orderID = orderID;
	}
// Get & Set id (from customers table)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
// Get & Set ItemID (from Items table)
	public Long getproductID() {
		return productID;
	}

	public void setproductID(Long productID) {
		this.productID = productID;
	}
	
	// Get & Set quantity
		public Long getquantity() {
			return quantity;
		}

		public void setquantity(Long quantity) {
			this.quantity = quantity;
		}
		
	
	//     EDIT THE return to include the TOTAL COST OF THE ORDER something like SELECT product(cost) WHERE productID = "?") * quantity 
	@Override
	public String toString() {
		return "\n\tOrder ID: " + orderID + "\n\tCustomer ID: " + id + "\n\tProduct ID: " + productID + "\n\tQuantity: " + quantity + "\n\tTotal Cost: " + (50 * quantity);
	}
	
	
	static void Calculate() {
		
		
	}
	
	
	
	// Hash Codes & Equals
	@Override
	public int hashCode() {
		return Objects.hash(id, orderID, productID, quantity);
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
		return Objects.equals(id, other.id) && Objects.equals(orderID, other.orderID)
				&& Objects.equals(productID, other.productID) && Objects.equals(quantity, other.quantity);
	}


}