package chapter23.javase5.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		Person p1 = new Person(111,"zhangsan",15);
		Person p2 = new Person(112,"lisi",16);
		Person p3 = new Person(113,"zhangsan",17);
		Person p4 = new Person(114,"wangwu",17);
		
		List<Person> list = new ArrayList<Person>();		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
		Environment env = new Environment();
		UpNameSort upSort = new UpNameSort();
		
		env.setSortInterface(upSort);		
		upSort.sort(list);
		System.out.println("UpNameSort:");
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println("id :" + 
					p.getId() + " Name: " + p.getName() + " age:" + p.getAge());
		}
		System.out.println("===================");
		
		
		UpIdSort upIdSort = new UpIdSort();		
		
		env.setSortInterface(upIdSort);		
		upIdSort.sort(list);
		System.out.println("UpIdSort:");
		for (int i = 0; i < list.size(); i++) {
			Person p = list.get(i);
			System.out.println("id :" + 
					p.getId() + " Name: " + p.getName() + " age:" + p.getAge());
		}
		System.out.println("===================");
	}
}
