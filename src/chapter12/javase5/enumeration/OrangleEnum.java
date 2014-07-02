package chapter12.javase5.enumeration;

public enum OrangleEnum {
	orange(5),mandarin(6),grapefruit(7),pomelo(4),shaddock(10);
	private int price;
	OrangleEnum(int p){
		this.price = p;
	}
	int getPrice(){
		return price;
	}
}
