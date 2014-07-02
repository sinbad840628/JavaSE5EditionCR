package chapter11.javase5.mutithreads;

public class InputOutputDemo {
	public static void main(String[] args) {
		Resourse resourse = new Resourse();
		Input input = new Input( resourse );
		Output output = new Output( resourse );
		
		Thread t1 = new Thread(input);
		Thread t2 = new Thread(output);
		
		t1.start();
		t2.start();
	}
}
