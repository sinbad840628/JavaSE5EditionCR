package chapter23.javase5.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UpAgeSort implements SortInterface,Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}

	@Override
	public void sort(List<Person> list) {
		Collections.sort(list,this);
	}

}
