package com.qa.ims.persistence.domain;

public class Items {


			private Long productID;
			private String item;
			private double cost;
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
				return "Product id:" + productID + " Item:" + item + " Cost:" + cost;
//						+ " Stock:" + stock;
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((item == null) ? 0 : item.hashCode());
				result = prime * result + ((productID == null) ? 0 : productID.hashCode());
//cannot invoke cost
//				result = prime * result + ((cost == null) ? 0 : cost.hashCode());
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
				Items other = (Items) obj;
				if (getitem() == null) {
					if (other.getitem() != null)
						return false;
				} else if (!getitem().equals(other.getitem()))
					return false;
				if (productID == null) {
					if (other.productID != null)
						return false;
				} else if (!productID.equals(other.productID))
					return false;
//				if (cost == null) {
//					if (other.cost != null)
//						return false;
//				} else if (!cost.equals(other.cost))
//					return false;
				return true;
			}

		}
