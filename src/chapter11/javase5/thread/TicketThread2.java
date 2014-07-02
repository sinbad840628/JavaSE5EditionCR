package chapter11.javase5.thread;

public class TicketThread2 implements Runnable {

	private int ticket = 100;

	@Override
	public void run() {
		while (true) {
			if (ticket > 0) {
				try {
					Thread.sleep(100);
					System.out.println(Thread.currentThread().getName() + "sale : "
							+ ticket--);
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		}
	}
}
