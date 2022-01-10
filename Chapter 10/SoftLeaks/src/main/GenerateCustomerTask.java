package main;
import java.util.UUID;


public class GenerateCustomerTask extends Thread {

	private CustomerQueue cq;

	public GenerateCustomerTask() {
		this.cq = CustomerQueue.getInstance();
	}

	@Override
	public void run() {
		while (true) 
		{
			try {
				String name = UUID.randomUUID().toString();
				Customer c = new Customer(name);
				cq.addCustomer(c);
			} catch (InterruptedException e) {
				System.out.println("Generate task has terminated.");
			}

		}
	}
}



