package chapter11.javase5.thread;

public class Test2 extends Thread {
	private String name;
	public Test2(String name){
		this.name = name;
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println( this.name + " Test run " + i);
		}
	}
}
