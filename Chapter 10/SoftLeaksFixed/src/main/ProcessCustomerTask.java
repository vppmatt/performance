package main;

public class ProcessCustomerTask extends Thread {

    private long customersProcessed;
    private CustomerQueue cq;

    public ProcessCustomerTask() {
        this.cq = CustomerQueue.getInstance();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Customer customer = customer = cq.getNextCustomer();
                customersProcessed++;
                if (customersProcessed % 100000 == 0) {
                    System.out.println(customersProcessed + " customers processed.");
                }
            } catch (InterruptedException e) {
                System.out.println("Process task has terminated.");
            }

        }

    }

}
