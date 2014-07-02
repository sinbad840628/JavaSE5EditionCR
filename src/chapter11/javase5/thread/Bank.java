package chapter11.javase5.thread;
/**
 	需求：
 	银行有一个金库，
 	有两个储户分别存300元，每次存100元，存3次。
 	
 	目的：该程序是不是有安全问题，如果有的话，如何解决？
 	
 	如何找问题？
1. 	明确哪些代码是多线程运行代码？
2. 明确多线程的共享数据？
3. 明确多线程运行代码中哪些语句是操作共享数据的？	
 */
public class Bank {
	Object object = new Object();
	private int sum;
	public synchronized void add( int n){ //同步函数中的更新，比同步代码块好多了。
		//synchronized (object) {
			
			try {
				sum = sum+n;
				Thread.sleep(100);
				System.out.println("sum=" + sum);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		//} end of synchronized block
	}
}
