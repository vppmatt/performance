package main;
public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		Thread monitorTask = new QueueMonitorTask();
		monitorTask.start();

		Thread generateCustomerTask = new GenerateCustomerTask();
		generateCustomerTask.start();

		Thread processTask = new ProcessCustomerTask();
		processTask.start();

		monitorTask.join();

	}

}
