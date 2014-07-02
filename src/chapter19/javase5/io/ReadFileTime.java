package chapter19.javase5.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ReadFileTime {

	public static void main(String[] args) {
		getCreateTime();
		getModifiedTime_1();
		getModifiedTime_2();
	}

	public static void getCreateTime(){
		String filePath="C:\\export_data.txt";
		String strTime = "";
		
		try {
			Process p = Runtime.getRuntime().exec("cmd /C dir " +filePath+ "/tc" );
			InputStream is = p.getInputStream();
			
			BufferedReader br = new BufferedReader( new InputStreamReader(is));
			
			String line;
			
			while( (line = br.readLine()) != null ){
				if (line.endsWith(".txt")) {
					System.out.println(line);
					strTime = line.substring(0,20);
					break;
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("创建时间为:" +strTime);
	}
	
	@SuppressWarnings("deprecation")
	public static void getModifiedTime_1(){
		File f = new File("C:\\export_data.txt");
		Calendar cal = Calendar.getInstance();
		long time = f.lastModified();
		cal.setTimeInMillis(time);
		System.out.println("修改时间[1]为:" + cal.getTime().toLocaleString());
	}
	public static void getModifiedTime_2(){
		File file = new File("C:\\export_data.txt");
		Calendar cal = Calendar.getInstance();
		long time = file.lastModified();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		cal.setTimeInMillis(time);
		System.out.println("修改时间[2]为:" + formatter.format(cal.getTime()));
	}
	
}
