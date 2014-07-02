package chapter11.javase5.thread;

public class TicketSynchronizedUpdateDemo {

	public static void main(String[] args) {

		TicketSynchronizedUpdate ticket = new TicketSynchronizedUpdate();
		
		Thread t5 = new Thread( ticket ); 
		Thread t6 = new Thread( ticket ); 
		Thread t7 = new Thread( ticket ); 
		Thread t8 = new Thread( ticket ); 
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}

}
