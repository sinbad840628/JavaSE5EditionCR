package chapter12.javase5.enumeration;

public class AppleEnumDemo2 {
	/**
	 * Testing the usage of value()
	 * */	
	public static void main(String[] args) {
		AppleEnum ap;
		System.out.println("All apple are contains:");
		//Apple allApples[] = Apple.values();
		
		for(AppleEnum a : AppleEnum.values()){
			System.out.println(a);
		}
		System.out.println("====");
		
		
		/**
		 * Testing the usage of valueOf()
		 * */		
		ap = AppleEnum.valueOf("Winesap");
		System.out.println("ap contains " + ap);
		System.out.println("====");
		
		
		
		ap = AppleEnum.valueOf("Sinbad");
		System.out.println("ap contains " + ap);
	}

}
