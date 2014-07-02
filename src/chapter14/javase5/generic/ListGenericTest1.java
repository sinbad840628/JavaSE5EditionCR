package chapter14.javase5.generic;

import java.util.ArrayList;
import java.util.List;

public class ListGenericTest1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add("String");
		list.add(new Integer(100));
		list.add(new Boolean(true));
		
		@SuppressWarnings("unused")
		String string = (String) list.get(0);
		@SuppressWarnings("unused")
		Integer in = (Integer) list.get(1);
		@SuppressWarnings("unused")
		Boolean bo = (Boolean) list.get(2);

	}

}
