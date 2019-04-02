package com.assignment.equalexpert.harsh.shoppingcart;

import java.math.BigDecimal;

import com.assignment.equalexpert.harsh.shoppingcart.bean.Order;
import com.assignment.equalexpert.harsh.shoppingcart.bean.OrderItem;
import com.assignment.equalexpert.harsh.shoppingcart.checkout.CheckoutOrder;
import com.assignment.equalexpert.harsh.shoppingcart.checkout.CheckoutOrderWithTax;
import com.assignment.equalexpert.harsh.shoppingcart.tax.GovtTax;
import com.assignment.equalexpert.harsh.shoppingcart.tax.ITax;

public class ShoppingCartMain {

	public ShoppingCartMain() {
	}

	public static void main(String[] args) {
		Order order = null;
		CheckoutOrder checkoutOrder = null;

		{// Step 1
			OrderItem orderItem = new OrderItem("Dove", 5, new BigDecimal(39.99));
			order = new Order();
			order.addOrderItem(orderItem);

			checkoutOrder = new CheckoutOrder(order);
			System.out.println(checkoutOrder.getTotalAmount());
		}
		{// Step2
			OrderItem orderItem = new OrderItem("Dove", 5, new BigDecimal(39.99));
			order = new Order();
			order.addOrderItem(orderItem);

			OrderItem orderItemSecond = new OrderItem("Dove", 3, new BigDecimal(39.99));
			order.addOrderItem(orderItemSecond);

			checkoutOrder = new CheckoutOrder(order);
			System.out.println(checkoutOrder.getTotalAmount());
		}
		{// Step 3
			OrderItem orderItem = new OrderItem("Dove", 2, new BigDecimal(39.99));
			order = new Order();
			order.addOrderItem(orderItem);

			OrderItem orderItemSecond = new OrderItem("Axe Deo", 2, new BigDecimal(99.99));
			order.addOrderItem(orderItemSecond);

			ITax iTax = new GovtTax();
			checkoutOrder = new CheckoutOrderWithTax(order, iTax);
			System.out.println(checkoutOrder.getTotalAmount());
		}
	}

}
