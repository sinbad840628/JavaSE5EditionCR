package chapter13.javase5.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {
	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter character,'q' to quit");
		do{
			c = (char) br.read();
			System.out.println(c);
			
		}while( c == 'q');
	}
}
