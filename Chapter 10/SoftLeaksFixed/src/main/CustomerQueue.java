package main;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class CustomerQueue {

	private static CustomerQueue instance;

	public static CustomerQueue getInstance() {
		if (instance == null) {
			instance = new CustomerQueue();
		}
		return instance;
	}

	private AtomicInteger nextCustomerId;
	private BlockingQueue<Customer> queue;

	private CustomerQueue() {
		nextCustomerId = new AtomicInteger(0);
		queue = new LinkedBlockingQueue<>(500);
	}

	public void addCustomer(Customer customer) throws InterruptedException {
		int id = nextCustomerId.incrementAndGet();
		customer.setId(id);
		boolean result = queue.offer(customer, 5, TimeUnit.MINUTES);
		if (result == false) {
			System.out.println("Unable to add a customer to the queue - something has gone wrong!");
		}

	}

	public Customer getNextCustomer() throws InterruptedException {
		return queue.take();
	}

	public void howManyCustomers() {
		System.out.println("" + new Date() + " Customers in queue : " + queue.size());
	}

}
