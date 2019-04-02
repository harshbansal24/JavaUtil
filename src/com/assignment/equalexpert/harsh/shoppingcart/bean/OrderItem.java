package com.assignment.equalexpert.harsh.shoppingcart.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1061488685156760180L;

	private String strProductName;

	private int quantity;

	private BigDecimal price;

	public OrderItem(String strProductName, int quantity, BigDecimal price) {
		this.strProductName = strProductName;
		this.quantity = quantity;
		this.price = price;
	}

	public BigDecimal getAmount() {
		return price.multiply(new BigDecimal(quantity));
		
	}

}
