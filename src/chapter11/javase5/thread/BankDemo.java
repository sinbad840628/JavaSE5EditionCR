package chapter11.javase5.thread;

public class BankDemo {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Thread t1 = new Thread( customer);
		Thread t2 = new Thread( customer);
		t1.start();
		t2.start();
	}

}
