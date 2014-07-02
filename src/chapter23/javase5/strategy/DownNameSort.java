package chapter23.javase5.strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DownNameSort implements SortInterface, Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int result = p2.getName().compareTo(p1.getName());

		if (0 == result) {
			return p1.getId() - p2.getId();
		}
		return result;
	}

	@Override
	public void sort(List<Person> list) {
		Collections.sort(list, this);
	}

}
