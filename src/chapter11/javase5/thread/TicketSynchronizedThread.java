package chapter11.javase5.thread;

/**
  对象如同锁，持有锁的线程可以在同步中执行，
  没有持有锁的线程即使获取CPU的执行权，也进不去，因为没有获取到锁。
  飞机，火车上的卫生间--经典，不错解释了。
  
  同步的前提：
 1. 必须要有两个或者两个以上的线程。（火车上上一个厕所）
 2.必须是多个线程使用同一个锁。（火车上有两个厕所没有什么用啊。。）
 	你进去了，我不能进去；我进去了，你不能进。
 	必须保证同步中只能有一个线程在执行。
 	
 好处就是：解决了多线程的安全问题。
 弊端：多个线程都需要判断有没有锁需要消耗资源，减少效率（不过是在安全范围内的）。	
 */
public class TicketSynchronizedThread implements Runnable{

	private int ticket =100;
	Object object = new Object();
	@Override
	public synchronized void run() {
		while(true){
			//synchronized( object ){
				try {
					Thread.sleep(100);
					if(ticket > 0 ){
						System.out.println(Thread.currentThread().getName() + " sale : "+ ticket--);
					}
				} catch (Exception e) {
					// TODO: handle exception
				//}
			}
		}//end of while		
	}
}
