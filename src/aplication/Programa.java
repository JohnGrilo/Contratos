package aplication;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.Pending_Payment);

		System.out.println(order);
	}
		
}
