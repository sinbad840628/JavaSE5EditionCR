package chapter18.javase5.Observer;

public class ObserverDemo {

	public static void main(String[] args) {
		BeingWatched observered = new BeingWatched();
		Watcher observing = new Watcher();
		observered.addObserver(observing);
		observered.counter(20);
 	}

}
