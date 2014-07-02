package chapter11.javase5.thread;
/**
	思考1： wait（）,notify(),notifyAll() ，用来操作线程为什么定义了在Object类中？
	
	1. 这些方法存在与同步中。
	2，使用这些方法必须要标识所属的同步锁。
	3，锁可以是任意对象，所以任一对象调用的方法一定定义Object类中。

思考2：wait（），sleep（）有什么区别？
wait（）：释放资源，释放锁。
sleep（）：释放资源，不释放锁。

线程间通讯：
其实就是多个线程操作同一个资源，(单例)
但是操作的动作不同。

class  Res
{
	String name;
	String sex;
}

class Input implements Runnable{
	private Res r;
	Input(Res s){
		this.r = r;
	}

		public void run(){
		int x = 0;
			while(true){
				if( x == 0 ){
					r.name = "Mike";
					r.sex = "Male";
				}else{
				r.name = "Rose";
				r.sex = "female";
				}
				x = (x+1)%2;
			}
		}
}

class output implements Runnable(){
	private Res r;
	Output(Res r){
	}

		public void run(){
			while(true){
				system.out.println(r.name +"..." + r.sex)
			}
		}
}

 */


public class ThreadNote {

}
