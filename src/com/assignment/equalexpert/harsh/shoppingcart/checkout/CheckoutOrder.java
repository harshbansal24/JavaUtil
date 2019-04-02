package com.assignment.equalexpert.harsh.shoppingcart.checkout;

import java.math.BigDecimal;

import com.assignment.equalexpert.harsh.shoppingcart.bean.Order;

public class CheckoutOrder {

	Order order;

	public CheckoutOrder(Order order) {
		this.order = order;

	}

	public BigDecimal getTotalAmount() {
		return order.getTotalAmount();
	}

}
