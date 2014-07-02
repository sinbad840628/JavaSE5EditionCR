package chapter33.javase5.designpattern;

/**
   单例设计模式：
   懒汉式：
   
   class Single{
   		private static  Single s = null;
   		private Single(){}
   		//如果多个线程并发访问这个共享数据S的时候，就有可能会出现问题。
   		 * 线程A读完这句（s == null）之后，等于空
   		 * 线程B读完这句之后，也等于空，
   		 * 结果线程A和B的时候，都创建了新的数据，
   		 * 所以在多线程状态下，很有可能出现问题，所以需要追加 synchronized这个同步关键字
   		public static synchronized Single getInstance(){// 只有追加了synchronized 之后，才能解决这个问题。
   		但是问题就是变得低效了。
   			if( s == null){	//	在这个环节中，单例模式被延时加载了。
   			s = new Single();
   			return s;
   			} 
   		}
   }
   
   但是如何改进多线程状态下的懒汉式单例模式的效率？
   解决之道就是将同步函数的方法改进成为同步代码块，
   class Single{
   private static Single = null;
   private Single(){}
   public static Single getInstance(){
   		if( s ==null ){ //懂这个意思吗？为什么要双重写s == null；
   		synchronized( Single.class){ //  里面的对象写谁？肯定不可以是 this， 所以这种情况下要写的就是对象本身的类、
   			if(s == null)
   				s = new Single();
   				return s;
   		}
   		
   		]
  	}
   原因就是多线程中，会有线程A，线程B，线程C多次访问判断，所以为了防止多个线程同时创建新的单例对象。
   所以做了双重为空的判断，这么做的方式避免了多重创建，也增加了懒汉式单例模式的效率。
   
   
   }//end of class
   饿汉式：
   
   class Single{
   	private static final Single s = new Single();  //只有一个
   	private Single(){}
   	public static Single getInstance(){
   			return s;
   		} 
   }
   
   懒汉单例模式和饿汉单例模式的区别（考点）
   
   懒汉单例模式是实例延时加载，有些问题，在多线程访问的时候可能出安全问题，解决方式就是加同步来解决，
   加同步的方式：同步代码块或者加同步方法，
   同步方法比较低效，
   同步代码块中，追加双重判断可以增加单例模式的效率。
   加同步的时候，锁是哪一个？该类的字节码对象（Single.class），
   
   面试中就是面懒汉式单例模式，
   考点：请写一个延时加载的单例模式，知道如何写了吗？
 * */
public class SingleDemo {

	public static void main(String[] args) {

	}

}
