package com.assignment.equalexpert.harsh.shoppingcart.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8988084215133976166L;
	List<OrderItem> listOfOrderItem;

	public Order() {
		listOfOrderItem = new ArrayList<>(5);
	}

	public void addOrderItem(OrderItem orderItem) {
		listOfOrderItem.add(orderItem);
	}

	public BigDecimal getTotalAmount() {
		BigDecimal totalAmount = new BigDecimal(0.00);
		for (OrderItem orderItem : listOfOrderItem) {
			totalAmount = totalAmount.add(orderItem.getAmount());
		}
		return totalAmount.setScale(2,BigDecimal.ROUND_HALF_UP);
	}
}
