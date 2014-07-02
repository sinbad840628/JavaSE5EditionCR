package chapter16.javase5.lang;

import java.io.IOException;

public class PBDemo {

	public static void main(String[] args) {

		try {
			ProcessBuilder proc = new ProcessBuilder("notepad.exe", "testfile");
			proc.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
