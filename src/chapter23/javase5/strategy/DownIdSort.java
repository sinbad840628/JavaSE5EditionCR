package chapter23.javase5.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DownIdSort implements SortInterface,Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p2.getId() - p1.getId();
	}

	@Override
	public void sort(List<Person> list) {
		Collections.sort(list,this);
	}

}
