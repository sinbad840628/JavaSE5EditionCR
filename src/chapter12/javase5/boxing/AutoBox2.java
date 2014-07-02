package chapter12.javase5.boxing;

public class AutoBox2 {

	static int m(Integer v){
		return v;
	}
	
	public static void main(String[] args) {

		Integer iob = m(100);
		System.out.println(iob);
	}

}
