package chapter11.javase5.mutithreads;

public class Output implements Runnable {
	private Resourse r;
	Object object = new Object();
	public Output(Resourse r) {
		this.r = r;
	}
	@Override
	public void run() {
		while (true) {
			synchronized (Input.class) {
				if(!r.flag){
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println( r.name + "... " + r.sex);
				r.flag = false;
				notify();
			}
		}
		
	}

}
