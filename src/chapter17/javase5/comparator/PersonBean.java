package chapter17.javase5.comparator;

public class PersonBean implements Comparable<PersonBean>{
	private int age = 0;
	private String name = "";
	public PersonBean(int age,String name){
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}
 
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object o){
		if (!(o instanceof PersonBean)) {
			return false;
		}
		PersonBean person = (PersonBean)o;
		return (age == person.age) && (name.equals(person.name));
	}
	
	@Override
	public int hashCode(){
		int result = 17;
		result = 31* result + age;
		result = 31 * result + name.hashCode();
		return result;
	}

	public String toString(){
		return (age + "{" + name + "}");
	}
	
	@Override
	public int compareTo(PersonBean o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
