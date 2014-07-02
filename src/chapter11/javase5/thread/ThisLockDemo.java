package chapter11.javase5.thread;

public class ThisLockDemo {
/**
 如果同步函数被静态修饰之后，使用的锁是什么呢？
 通过验证，发现不再是this。因为静态方法中也不可以定义this。
 
 静态进内存是，内存中没有本类对象，但是一定有该类对应的字节码文件对象。
 类名。class  该对象的类型是Class
 
 静态的同步方法，使用的锁是该方法所在类的字节码文件对象。类名.class
  */
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		
		Thread t1 = new Thread(ticket);
		Thread t2 = new Thread(ticket);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ticket.flag = false;
		t2.start();
	}

}
