package chapter13.javase5.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CreateTxtFile {

	/**
	 * @param args
	 * @author Sinbad840628
	 * @since 2014.08.11 23:02
	 */
	public static void main(String[] args) {
		//TODO: 如何解决在C盘无法创建文件的问题
		File filename = new File("c:\\2.gwl");
		
		String filein = "hello";
		
		RandomAccessFile mm = null;
		try {
			mm = new RandomAccessFile(filename, "rw");
			mm.writeBytes(filein);
			System.out.println("书写完毕");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (mm!= null) {
				try {
					mm.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
