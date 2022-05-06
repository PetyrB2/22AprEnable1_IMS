package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Items {


			public Long productID;
			public String item;
			public double cost;
//			private int stock;

			public Items(String item, double cost) {
				this.setitem(item);
				this.setcost(cost);
//				this.setstock(stock);
			}

			public Items(Long productID, String item, double cost) {
				this.setproductID(productID);
				this.setitem(item);
				this.setcost(cost);
//				this.setstock(stock);
			}

			//Getter and Setters for Long productID
			public Long getproductID() {
				return productID;
			}

			public void setproductID(Long productID) {
				this.productID = productID;
			}
			
			//Getter and Setters for String item
			public String getitem() {
				return item;
			}

			public void setitem(String item) {
				this.item = item;
			}
			
			//Getter and Setters for double cost
			public double getcost() {
				return cost;
			}

			public void setcost(double cost) {
				this.cost = cost;
			}

			//Getter and Setters for int stock
//			public int getstock() {
//				return stock;
//			}
//
//			public void setstock(int stock) {
//				this.stock = stock;
//			}
				
				
			//OVERRIDE for String toString
			@Override
			public String toString() {
				return "\tProduct id:" + productID + "\t\r\nItem:" + item + "\t\r\nCost:" + cost;
//						+ " Stock:" + stock;
			}

			@Override
			public int hashCode() {
				return Objects.hash(cost, item, productID);
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Items other = (Items) obj;
				return Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost)
						&& Objects.equals(item, other.item) && Objects.equals(productID, other.productID);
			}
			

}