package chapter11.javase5.thread;

public class ThreadDemo2  extends Thread{
	public void run(){
		for (int i = 0; i < 60; i++) {
			System.out.println("ThreadDemo run!");
		}
	}
}
