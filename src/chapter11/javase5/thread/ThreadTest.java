package chapter11.javase5.thread;

/*
 *  练习：创建两个线程，和main主线程抢占资源。
 *  知道run（）方法和start（）方法的区别
 *  Thread 创建之类底层，
 *  创建目的是为什么？是为了运行线程，方法是调用start（）方法，其中start方法是抢占资源用的。
 *  
 *  当线程在忙的时候，进行人为干涉线程，让它冻结的时候，我可以调用sleep（）功能，
 *  只要让线程睡觉，线程就暂时停止，但是不代表消亡，一旦sleep（5000）时间到达的时候，
 *  线程自动唤醒，然后继续运行。
 *  
 *  还有另外一个功能就是 wait（）方法，就是永久性挂在那里，
 *  notify（）方法，就是唤醒的方法，叫另一个线程唤醒这个线程。
 *  
 *  destory（）方法，就是消亡的意思，[我不stop，可以直接消亡吗？
 *  可以的，当run结束之后，内容没有的话，就自动消亡掉了。
 *  ]
 *  stop（）方法，
 *  
 *  
 *  任务管理器中强制杀死进程中的“结束进程”的按钮。
 *  
 * * 临时阻塞状态，就是具备运行资格，但是没有执行权。
 * * 冻结状态，就是放弃了执行资格，别理我的状态。 
 * 从冻结状态-->到临时阻塞状态，就是说具备执行资格了，但是还不知道什么时候执行。
 * 
 * currentThread()  获取当前线程对象。
 * getName（）  获得线程名称。
 * setName（）  设置线程名称
 * */

public class ThreadTest {

	public static void main(String[] args) {
		Test2 t1 = new Test2("one");
		Test2 t2 = new Test2("two");
		//t1.start();		//start方法，是用来抢占资源的方法。
		//t2.start();
		t1.run();
		t2.run();//如果循环是6000的话，一个线程没完成的话，另外一个线程没办法进行。
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread() +  " ... " + i);
		}
	}
}
