package chapter24.javase5.GUI;

import java.applet.Applet;
import java.awt.Frame;

public class MenuDemo extends Applet{

	Frame frame;
	public void init(){
		frame = new MenuFrameDemo("Menu Demo");
		int width = Integer.parseInt(getParameter("width"));
		int height = Integer.parseInt(getParameter("height"));
		setSize(width, height);
		frame.setVisible(true);
	}
	
	public void start(){
		frame.setVisible(true);
	}
	
	public void stop(){
		frame.setVisible(false);
	}
}
