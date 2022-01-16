package main;

import java.util.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Queue<Customer> customers = new LinkedList<>();
		while(true) {
			Customer c = new Customer(UUID.randomUUID().toString());
			customers.offer(c);
			if (customers.size() > 10000) {
				for (int i = 0; i < 5000; i++) {
					customers.poll();
				}
			}
			//This line of code is just to slow things down slightly.
			Thread.sleep(5);

		}


	}

}
