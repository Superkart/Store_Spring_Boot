package com.superkart.store;

import java.util.Observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(StoreApplication.class, args);

		var OrderService = new OrderService(new StripePaymentService());
		var OrderService2 = new OrderService(new PaypalPaymentService());

		OrderService.PlaceOrder();
		OrderService2.PlaceOrder();
	}

}
