package chapter07.javase5.varargs;

public class VarArgs {

	public static void varTest(int ...v){
		System.out.print("number of args:" + v.length + " Contents is ");
		for (int x : v) {
			System.out.print( x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		varTest(10);
		varTest(1,2,3,4,5,6);
		varTest();
	}

}
