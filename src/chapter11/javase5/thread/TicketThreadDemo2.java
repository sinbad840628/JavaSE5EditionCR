package chapter11.javase5.thread;

/**
   创建线程的第二种方法： 实现Runnable接口
   
   步骤：
   1.定义类实现Runnable接口
   2.覆盖Runnable接口的run（）方法
 	                	将线程要运行的代码存放到该run方法中。
  3.通过Thread类创建线程对象。
  4.将Runnable接口中的子类对象作为实际参数，传递给Thread类的构造方法。
  		为什么要将runnable接口的子类对象传递给Thread的构造函数中去？
  		因为自定义的run方法所属的对象是Runn接口的子类对象，
  		所以要让线程制定指定对象的run方法，就必须明确该run方法的所属对象。
  5.调用Thread类的start方法并调用Runnable接口子类 的run方法。
  
  线程实现方式和继承有什么区别？
  
  有一个student类，继承了Person类，但是因为java的单继承设定，它就没有办法继承Thread类了，
  因此在开启了实现runnable接口的方法。
 “你可以不是我的孩子，我照样可以帮你忙，但是你得听从我的规矩”（同一个意思）
 好处在于在定义线程的时候，避免了单继承的局限性，并又扩展了自己的功能。
  implements 接口 进行实现。
  所以到最后：student具备了Person的特性，同时实现了Runnable的接口，
  
  两种方式的区别在于：
  继承Thread：线程代码存放Thread子类run方法中。
  实现Runnable：线程代码存在接口的子类的run方法。
  
   */

public class TicketThreadDemo2 {

	public static void main(String[] args) {
		
		//真正创建线程的话
		TicketThread2 ticket = new TicketThread2();
		
		Thread t1 = new Thread(); // 这个才是一个线程。
		Thread t2 = new Thread(); // 这个才是一个线程。
		Thread t3 = new Thread(); // 这个才是一个线程。
		Thread t4 = new Thread(); // 这个才是一个线程。
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		//这样子是没用的，以上的4个run方法，只是Thread中的run方法，这个方面里面没有对应的卖票代码内容。		
		//Q:如何让里面对应的卖票代码和这4个线程对象连接在一起呢？
		//A: 看下面的使用方法, new Thread( ticket );  注意方法参数。
		
		Thread t5 = new Thread( ticket ); // 这个才是一个线程。
		Thread t6 = new Thread( ticket ); // 这个才是一个线程。
		Thread t7 = new Thread( ticket ); // 这个才是一个线程。
		Thread t8 = new Thread( ticket ); // 这个才是一个线程。
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}

}
/**
 Thread-4sale : 1
Thread-5sale : 0
Thread-7sale : -1
Thread-6sale : -2

通过分析，发现 打印了 0，-1，-2 等错票。
多线程的运行出现了安全问题，
0的时候，线程还没有执行完，结果被别的线程抢走了。

问题的原因：
    当多条语句在操作同一个线程共享数据的时候，一个线程对多条语句只执行了一部分，还咩有执行完，
     另一个线程参与进来执行，导致了共享数据的错误。
     
 解决办法就是：
     对多条操作共享数据的语句，只能让一个线程都执行完，在执行 过程中，其他线程不可以参与执行。
     
        Java对于多线程的安全问题提供了专业的解决方式。
        就是同步代码块。
        synchronized（对象）{
         需要同步的数据。
        }

 * */

