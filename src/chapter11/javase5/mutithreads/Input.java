package chapter11.javase5.mutithreads;

public class Input implements Runnable {

	private Resourse r;
	Object object = new Object();
	
	public Input( Resourse r) {
		this.r = r;
	}
	@Override
	public void run() {
	 int x = 0;
	 while(true){
		synchronized (Input.class) {
			if(r.flag){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			 if (x == 0) {
					r.name = "mike";
					r.sex = "man";
				}else{
					r.name = "丽丽";
					r.sex = "女女";
				}
				 x = (x+1) % 2;
				 r.flag = true;
				 notify();
		}
	 }
		
	}

}
