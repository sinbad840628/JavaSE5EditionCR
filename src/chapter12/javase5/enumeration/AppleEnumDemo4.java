package chapter12.javase5.enumeration;

public class AppleEnumDemo4 {

	public static void main(String[] args) {
		AppleEnum apple1,apple2,apple3;
		System.out.println("All apple are contains those things:");
		for(AppleEnum a : AppleEnum.values()){
			System.out.println(a + " " + a.ordinal());
		}
		apple1 = AppleEnum.RedDel;
		apple2 = AppleEnum.GoldenDel;
		apple3 = AppleEnum.RedDel;
		
		//Demonstrate compareTo() and equals()
		if( apple1.compareTo(apple2) < 0){
			System.out.println(apple1 +" is before " + apple2);
		}
		if( apple1.compareTo(apple2) > 0){
			System.out.println(apple1 +" is after " + apple2);
		}
		if (apple1.compareTo(apple3) == 0 ) {
			System.out.println(apple1 +" equals " + apple3);
		}
		System.out.println("=====================");
		if( apple1.equals(apple2)){
			System.out.println("Error");
		}
		if ( apple1.equals(apple3)) {
			System.out.println(apple1 +" equals " + apple3);
		}
		if ( apple1 == apple3 ) {
			System.out.println(apple1 +" == " + apple3);
		}
	}

}
