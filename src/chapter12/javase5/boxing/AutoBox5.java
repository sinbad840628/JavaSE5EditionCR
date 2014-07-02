package chapter12.javase5.boxing;

public class AutoBox5 {

	public static void main(String[] args) {
		Boolean b = true;
		if( b){
			System.out.println("b is true");
		}
		Character ch = 'x';
		char chr = ch;
		System.out.println("char is " + chr);

	}

}
