package chapter18.javase5.Observer;

public class TwoObservers {
	public static void main(String[] args) {
		BeingWatched observered = new BeingWatched();
		Watcher1 observer1 = new Watcher1();
		Watcher2 observer2 = new Watcher2();
		
		observered.addObserver(observer1);
		observered.addObserver(observer2);
		
		observered.counter(20);
	}
}
