package chapter00.javase5.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter c = new Counter("C:\\Users\\Sinbad\\git\\JavaSE5EditionCR\\src");// 在这里修改目录
		c.countJavaFile(c.projectPath);

	}
}

class Counter {

	String projectPath;
	long blankLineNum = 0l;
	long zhushiLineNum = 0l;
	long codeLineNum = 0l;

	public Counter(String projectPath) {
		super();
		this.projectPath = projectPath;
	}

	public void countJavaFile(String path) {

		File f = new File(path);
		if (f.isDirectory()) {
			File[] childFiles = f.listFiles();
			for (int i = 0; i < childFiles.length; i++) {
				countJavaFile(childFiles[i].getAbsolutePath());
			}
		} else {
			if (f.getName().matches(".*\\.java$")) {// 判断文件是否为.java文件
				// blankLineNum = 0l;
				// zhushiLineNum = 0l;
				// codeLineNum = 0l;
				parse(f);
			}
		}
	}

	public void parse(File f) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			String line = "";
			Pattern blankP = Pattern.compile("^[\\s&&[^\\n]]*");
			Matcher blankM;
			boolean comment = false;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				blankM = blankP.matcher(line);
				if (blankM.matches()) {
					blankLineNum++;
				} else if (line.startsWith("/*") && !(line.endsWith("*/"))) {
					comment = true;
					zhushiLineNum++;
				} else if (line.startsWith("/*") && line.endsWith("*/")) {
					zhushiLineNum++;
				} else if (true == comment) {
					zhushiLineNum++;
					if (line.startsWith("*/")) {
						comment = false;
					}
				} else if (line.startsWith("//")) {
					zhushiLineNum++;
				} else {
					codeLineNum++;
				}
			}
			System.out.println("文件" + f.getAbsolutePath() + ":累计空行数："
					+ blankLineNum + " ,累计注释行数：" + zhushiLineNum + " ,累计代码行数："
					+ codeLineNum);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
