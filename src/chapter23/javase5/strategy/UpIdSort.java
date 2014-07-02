package chapter23.javase5.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UpIdSort implements SortInterface,Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return p1.getId()- p2.getId();
	}

	@Override
	public void sort(List<Person> list) {
		Collections.sort(list,this);
		
	}

}
