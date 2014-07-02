package chapter12.javase5.enumeration;

public class AppleEnumDemo {

	public static void main(String[] args) {
		
		AppleEnum ap;
		ap = AppleEnum.GoldenDel;		
		System.out.println("This Apple is " + ap);
		System.out.println("==================");
		
		ap = AppleEnum.Japanfuji;
		System.out.println("Now this apple is " + ap);
		
		if( ap == AppleEnum.GoldenDel){
			System.out.println(" ap contains GoldenDel");
		}
		switch (ap) {
		case Jonathan:
			System.out.println(" Jonathan is red. ");break;
		case GoldenDel:
			System.out.println(" GoldenDel is Yellow. ");break;
		case Japanfuji:
			System.out.println(" Japanfuji is green. ");break;
		case Chinafuji:
			System.out.println(" Chinafuji is light yellow. ");break;
		case RedDel:
			System.out.println(" RedDel is light red. ");break;
		case Winesap:
			System.out.println(" Winesap is dark yellow. ");break;
		case Cortland:
			System.out.println(" Cortland is light green. ");break;
		}
		System.out.println("****************************");
		System.out.println("ap's name is " + ap.name());
		System.out.println("ap's Order number is " + ap.ordinal());
		System.out.println("ap's hashCode is " + ap.hashCode());
		System.out.println("ap's DeclaringClass is " + ap.getDeclaringClass());
		System.out.println("ap's Compare Result is " + ap.compareTo(AppleEnum.Chinafuji));
		
	}//end of main

}//end of class EnumDemo
