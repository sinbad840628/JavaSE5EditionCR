package chapter14.javase5.generic;

public class GenericFoo<T> {

	private T foo;

	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}
	
	public static void main(String[] args) {
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		foo1.setFoo(true);
		foo2.setFoo(100);
		
		System.out.println("foo1 " + foo1.getFoo());
		System.out.println("foo2 " + foo2.getFoo());;
	}
}
