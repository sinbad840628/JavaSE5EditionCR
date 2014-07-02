package chapter23.javase5.strategy;

import java.util.List;

public class Environment {

	private SortInterface sortInterface;
	
	public Environment(){}
	
	public Environment(SortInterface sortInterface){
		this.sortInterface = sortInterface;
	}

	public void setSortInterface(SortInterface sortInterface) {
		this.sortInterface = sortInterface;
	}
	
	public void sort(List<Person> list){
		this.sortInterface.sort(list);
	}
}
