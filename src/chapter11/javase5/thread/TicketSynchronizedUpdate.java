package chapter11.javase5.thread;
/** 
 同步函数需要用哪一个锁？
 函数需要被对象调用。那么函数都有一个所属对象引用，就是this。
 所以同步函数使用的锁是this。
 
 通过改程序进行验证。
 使用两个线程来卖票。
 一个线程在同步代码块中，
 一个线程在同步函数中。
 
 进程检查。
 
 
 */
public class TicketSynchronizedUpdate  implements Runnable{
	
	private int ticket = 1000;
	
	@Override
	public void run() {
		while(true){
			this.show();
		}
	}//end of run

	public synchronized void show(){
		if (ticket > 0) {
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName() + " sale : "+ ticket--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
