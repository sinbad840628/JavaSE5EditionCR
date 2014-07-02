package chapter11.javase5.thread;

public class TicketSynchronizedClient {

	public static void main(String[] args) {

		TicketSynchronizedThread ticket = new TicketSynchronizedThread();
		
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
