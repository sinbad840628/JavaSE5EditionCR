package chapter11.javase5.thread;

/**
 * 原来线程都有自己默认的名称。
 * Thread-编号，编号从0开始。
 * */

public class ThreadName extends Thread{

	//private String name;
	public ThreadName(String name){
		//this.name = name;
		super(name);  //这时候就可以调用线程名称了，可以设置线程名称了。
	}
	
	public void run(){
		for (int i = 0; i < 50; i++) {
			System.out.println(this.getName() + "run " + i);
		}
	}
}
