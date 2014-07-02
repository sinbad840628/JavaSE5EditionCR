package chapter18.javase5.Observer;

import java.util.Observable;
import java.util.Observer;

public class Watcher2 implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if (((Integer)arg).intValue() <= 7 ) {
			System.out.println("Watcher2:, count is "+ ((Integer) arg).intValue());
		}
	}
}
