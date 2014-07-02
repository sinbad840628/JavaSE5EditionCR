package chapter07.javase5.varargs;

public class PassArray {

	public static void varTest(int v[]){
		System.out.print("number of args:" + v.length + " Contents is ");
		for (int x : v) {
			System.out.print( x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1[] = {10};
		int n2[] = {2,3,4,5,6};
		int n3[] = {};
		
		varTest(n1);
		varTest(n2);
		varTest(n3);
	}

}
