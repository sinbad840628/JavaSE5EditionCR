package chapter11.javase5.thread;

public class DeadLockDemo {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(new Test(true));
		Thread t2 = new Thread(new Test(false));
		t1.start();
		t2.start();
	}

}
