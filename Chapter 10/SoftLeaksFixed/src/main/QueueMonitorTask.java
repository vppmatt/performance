package main;

public class QueueMonitorTask extends Thread {

    private CustomerQueue cq;

    public QueueMonitorTask() {
        this.cq = CustomerQueue.getInstance();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
                cq.howManyCustomers();
                //System.out.println("Available memory: " + Runtime.getRuntime().freeMemory() / 1024 + "k");
            } catch (InterruptedException e) {
                System.out.println("Monitor task has terminated.");
            }
        }
    }
}

