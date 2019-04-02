package com.assignment.equalexpert.harsh.shoppingcart.tax;

import java.math.BigDecimal;

public interface ITax {
	public BigDecimal getTaxedAmount(BigDecimal totalOrderAmount);
}
