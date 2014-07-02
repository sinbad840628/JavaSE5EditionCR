package chapter12.javase5.enumeration;

public class OrangleEnumDemo3 {

	public static void main(String[] args) {

		//OrangleEnum orangle;
		
		//Display the price of grapefruit
		System.out.println(" grapefruit costs " + OrangleEnum.grapefruit.getPrice());
		System.out.println("==================");
		System.out.println("All orangle Prices:");
		//Display all orangle's price;
		for(OrangleEnum a : OrangleEnum.values()){
			System.out.println( a + " costs " + a.getPrice());
		}
	}

}
