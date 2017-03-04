package it.bridgeconsulting.ocp.thread;

public class NameThread {
    public static void main(String[] args) {
        Thread t = new Thread(new NameRunnable());
        t.setName("Little child");
        t.start();
		System.out.println(Thread.currentThread().getName());
    }
}

class NameRunnable implements Runnable {
	@Override
    public void run() {
        System.out.println("Thread name is " + Thread.currentThread().getName());
    }
}