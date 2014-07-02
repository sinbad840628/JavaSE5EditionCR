package chapter15.javase5.string;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Hello";
		String s3 = "HELLO";
		System.out.println( s1 + " equals " + s2 +" -> " + s1.equals(s2));
		System.out.println( s1 + " equals " + s3 +" -> " + s1.equals(s3));
		System.out.println( s2 + " equals " + s3 +" -> " + s2.equals(s3));
	}
	
}
