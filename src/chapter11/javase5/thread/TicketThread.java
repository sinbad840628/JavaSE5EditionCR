package chapter11.javase5.thread;
/**
 * 需求：简单的卖票程序。实现多个窗口同时买票。
 * 
 * 
 * 
 * 
 * */
public class TicketThread extends Thread{

	private int ticket = 100;
//	private String name;
//	public TicketThread( String name){
//		super(name);
//	}
	
	public void run(){
		while(true){
			if( ticket > 0){
				System.out.println(this.currentThread().getName() + " sale :" + ticket--);
			}
		}
	}
}
