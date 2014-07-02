package chapter19.javase5.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFileTimeDemo {
	public static void main(String[] args) {
		getFileCreateTime();
	}
	
	public static void getFileCreateTime(){
		String filePath = "C:\\export_data.txt";
		String strTime = "";
		
		
		try {
			Process p = Runtime.getRuntime().exec("cmd /C dir " +filePath+ "/tc");
			InputStream is = p.getInputStream();
			
			BufferedReader br = new BufferedReader( new InputStreamReader(is));
			String line;
			while( ( line = br.readLine()) != null ){
				if (line.endsWith(".txt")) {
					strTime = line.substring(0,20);
					break;
				}
			}
			System.out.println("文件创建时间是:" + strTime);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
