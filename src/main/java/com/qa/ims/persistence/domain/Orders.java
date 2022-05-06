package com.qa.ims.persistence.domain;

import java.util.Objects;
public class Orders {

	private long orderID;
	private long id;
	private long productID;
	private long quantity;

	public Orders(long orderID, long id, long productID, long quantity) {
		this.setOrderId(orderID);
		this.setId(id);
		this.setproductID(productID);
		this.setquantity(quantity);
	}
	public Orders(long id, long productID, long quantity) {
		this.setId(id);
		this.setproductID(productID);
		this.setquantity(quantity);
	}
	
//	//FOR the CALCULATE BIT MAYBE
//	public Orders(Long orderID, Long id, Long productID, Long quantity, String item, Long cost, String firstName, String surname, String email,Long total) {
//		this.setOrderId(orderID);
//		this.setId(id);
//		this.setproductID(productID);
//		this.setquantity(quantity);
//		this.setitem(item);
//		this.setcost(cost);
//		this.setfirstname(firstName);
//		this.setsurname(surname);
//		this.setemail(email);
//		this.settotal(total);
//	}
//	
	
	
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
	
// Get & Set productID (from Items table)
	public long getproductID() {
		return productID;
	}

	public void setproductID(long productID) {
		this.productID = productID;
	}
	
	// Get & Set quantity
		public long getquantity() {
			return quantity;
		}

		public void setquantity(long quantity) {
			this.quantity = quantity;
		}
		
		
	//     EDIT THE return to include the TOTAL COST OF THE ORDER something like SELECT product(cost) WHERE productID = "?") * quantity 
	@Override
	public String toString() {
		return "\n\tOrder ID: " + orderID + "\n\tCustomer ID: " + id + "\tCustomer Name: " + "\n\tProduct ID: " + productID + "\tProduct Name: " + "\tProduct Cost: " + "\n\tQuantity: " + quantity + "\n\tTotal Cost: ";
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