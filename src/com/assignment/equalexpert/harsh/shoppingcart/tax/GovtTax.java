package com.assignment.equalexpert.harsh.shoppingcart.tax;

import java.math.BigDecimal;

public class GovtTax implements ITax {

	private BigDecimal taxRate = new BigDecimal(12.5);

	public GovtTax() {
	}

	@Override
	public BigDecimal getTaxedAmount(BigDecimal totalOrderAmount) {
		return totalOrderAmount.add(totalOrderAmount.multiply(taxRate.divide(new BigDecimal(100))));
	}

}
