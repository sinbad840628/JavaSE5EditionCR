package chapter11.javase5.thread;

public class Ticket implements Runnable{

	private int ticket = 1000;
	Object object = new Object();
	boolean flag = true;
	
	
	@Override
	public void run() {
		if(flag){
			while (true) {
				synchronized (this) {
					if (ticket > 0) {
						try {
							Thread.sleep(10);
							System.out.println(Thread.currentThread().getName() + "  code Sale   : "+ ticket--);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}//synchronized
			}// end of while 
		}else{
			while (true) {
				this.show();
			}
		}
	}//run function

	public synchronized void show(){
		if (ticket > 0) {
			try {
				Thread.sleep(10);
				System.out.println(Thread.currentThread().getName() + " ..show... : "+ ticket--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
