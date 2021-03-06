package chapter11.javase5.thread;

public class ThreadDemo {
/*进程就是正在执行中的程序。
	每一个进程执行，都有一个执行的顺序，该顺序是一个执行的路径，或者叫一个控制单元。
	程序启动，内存中分配一个地址，
	进程是用来
    线程是进程中的内容（真正执行的内容），进程中的一个独立单元，线程叫程序的执行路径。	
	线程在控制着进程的执行。
	一个进程中至少有一个线程，
	
	JavaVM 启动的时候会有一个进程 java.exe
	而且这个线程运行的代码都存在于main方法中，该线程称之为主线程
	负责执行代码的就是进程中的一个线程，
	
	很多书中，
	
	扩展：其实虚拟机启动的时候就是多线程。JVM不光有多条执行路径，还在控制过程中有一个垃圾被干掉了，
	还有垃圾回收线程。
	
	如何自定义自己的多线程？系统帮我创建什么样子的进程?
	通过对JavaAPI的查找，发现中有一个Thread类，
	创建线程的第一种方式就是继承thread类，
	1.定义类，继承Thread
	 2.覆写Thread中的run（）方法，是为了定义线程要运行自定义代码，将自定义的代码存储在run方法中，让线程运行。
	3.调用线程中的start方法：启动线程，调用方法。
	
	发现运行结果每一次都不同，因为多个线程都是获取CPU的使用权，CPU执行到谁，谁就运行。
	明确一点：在某一时刻，只能有一个程序在运行（多核除外），
	CPU在做着快读切换，已达到看上去是在同时运行的效果。
	我们可以形象的把多线程的运行行为堪称在互相抢夺CPU的控制权。
	
	这就是多线程的一个特性，随机性，谁抢到，谁执行，至于执行多长，CPU说了算。
	
	第二种方式就是实现runnable的接口。
	创建并启动一个线程
	
	2014-03-10 11:18
	为什么要覆盖run（）方法？
	Thread类用于描述线程，我们为什么要开启线程？
	要让某些代码
	该类就定义了一个功能，用于存储线程要运行的代码，该存储功能就是run（）方法。
	Thread t = new Thread();
	t.start();   这么做的虽然可以启动t中的run（）方法，但是里面的方法是空的。
	
	沿袭父类功能，覆写父类的方法，才能做到运行自定义的内容。
	*/
	
	public static void main(String[] args) {
		ThreadDemo2 d = new ThreadDemo2(); //这么做就是创建好一个线程。
		d.start();//开启线程并执行该线程的run方法，这是是用来和别的线程抢资源的
		d.run();//仅仅是对象调用方法，而线程创建了，并没有运行；如果别的程序在运行，它得等别人运行好了再运行。
		
		for (int i = 0; i < 60; i++) {
			//改代码就是用来让用户在任务管理器中找到执行进程的java.exe
			System.out.println("hello world--" + i);
		}
		
		/*for (int i = 0; i < 60; i++) {
			//改代码就是用来让用户在任务管理器中找到执行进程的java.exe
			System.out.println("Welcome Sinbad--" + i);
		}*/
		
		//程序开得越多，多个线程在抢劫CPU资源。其实就是CPU的执行使用权在不停的切换。
		//什么是瓶颈？内存是临时处理空间，没地方装处理数据的话。
	}
	
}
