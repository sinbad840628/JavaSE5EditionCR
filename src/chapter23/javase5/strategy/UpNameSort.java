package chapter23.javase5.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UpNameSort implements SortInterface,Comparator<Person>{

	@Override
	public void sort(List<Person> list) {
		 Collections.sort(list,this);		
	}

	@Override
	public int compare(Person p1, Person p2) {
		int result = p1.getName().compareTo(p2.getName());
		if(0 == result){
			return p1.getId() - p2.getId();
		}
		return result;
	}

}
