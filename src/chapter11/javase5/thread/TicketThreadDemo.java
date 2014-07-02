package chapter11.javase5.thread;

/**
 * Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:682)
	at chapter11.javase5.thread.TicketThreadDemo.main(TicketThreadDemo.java:11)
 * */

public class TicketThreadDemo {

	public static void main(String[] args) {
		TicketThread t1 = new TicketThread();
		//TicketThread t2 = new TicketThread();
		//TicketThread t3 = new TicketThread();
		//TicketThread t4 = new TicketThread();
		t1.start();
		t1.start();//怎么可以连续多次调用同一个方法呢。。。
		t1.start();
		t1.start();
	}

}
