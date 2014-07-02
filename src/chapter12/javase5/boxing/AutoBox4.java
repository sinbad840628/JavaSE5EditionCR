package chapter12.javase5.boxing;

public class AutoBox4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer iOb = 100;
		Double dOb = 98.6;
		dOb = dOb + iOb;
		System.out.println("dob after expression:" + dOb);
		System.out.println("==============");
		
		Integer iOb2 = 2;
		switch (iOb2) {
		case 1:System.out.println("one");break;
		case 2:System.out.println("two");break;
		default:System.out.println("error");break;
		}
	}

}
