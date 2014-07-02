package chapter15.javase5.stringbuffer;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("buffer = " + sb );
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity() );
	}
}
