package main;
import java.time.temporal.*;
import java.util.*;
import java.util.concurrent.*;

public class CustomerQueue {

	private static CustomerQueue instance;

	public static CustomerQueue getInstance() {
		if (instance == null) {
			instance = new CustomerQueue();
		}
		return instance;
	}

	private List<Customer> customerList;
	private BlockingQueue<Customer> queue;

	private CustomerQueue() {
		customerList = Collections.synchronizedList(new ArrayList<>());
		queue = new LinkedBlockingQueue<>(500);
	}

	public void addCustomer(Customer customer) throws InterruptedException {
		customerList.add(customer);
		int id = customerList.indexOf(customer);
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
