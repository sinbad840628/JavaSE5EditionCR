package chapter12.javase5.boxing;

public class UnboxError {

	public static void main(String[] args) {
		Integer iOb = 1000;
		int i = iOb.byteValue();	//manually unbox as byte;
		System.out.println("i = " + i);

	}

}
