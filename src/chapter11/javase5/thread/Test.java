package chapter11.javase5.thread;

public class Test implements Runnable{

	private boolean flag;
	Test(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if( flag){
			
			synchronized (MyLock.lockA) {
				System.out.println("if lockA");
				synchronized (MyLock.lockB) {
					System.out.println("if LockB");
				}
			}
		}else{
			synchronized (MyLock.lockB) {
				System.out.println("else lockB");
				synchronized (MyLock.lockA) {
					System.out.println("else lockA");					
				}
			}
		}		
	}


}
