package com.assignment.equalexpert.harsh.shoppingcart.checkout;

import java.math.BigDecimal;

import com.assignment.equalexpert.harsh.shoppingcart.bean.Order;
import com.assignment.equalexpert.harsh.shoppingcart.tax.ITax;


public class CheckoutOrderWithTax extends CheckoutOrder {

	ITax iTax;

	public CheckoutOrderWithTax(Order order, ITax iTax) {
		super(order);
		this.iTax = iTax;
	}

	@Override
	public BigDecimal getTotalAmount() {
		return iTax.getTaxedAmount(super.getTotalAmount()).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
