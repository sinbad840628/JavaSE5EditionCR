package chapter24.javase5.GUI;

import java.awt.CheckboxMenuItem;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MenuFrameDemo extends JFrame{

	private static final long serialVersionUID = 4534177836981850319L;
	
	String msg = null;
	CheckboxMenuItem debug,test;
	
	public MenuFrameDemo(String title){
		MenuBar mbar = new MenuBar();
		setMenuBar(mbar);
		
		//Create the menu items
		Menu file = new Menu("File");
		MenuItem item1,item2,item3,item4,item5;
		file.add(item1 = new MenuItem("New..."));
		file.add(item2 = new MenuItem("Open..."));
		file.add(item3 = new MenuItem("Close..."));
		file.add(item4 = new MenuItem("-"));
		file.add(item5 = new MenuItem("Quit..."));
		mbar.add(file);
		
		MyMenuHandler handler = new MyMenuHandler(this);
		
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		item4.addActionListener(handler);
		item5.addActionListener(handler);
		//item2.addActionListener(handler);
		
		MyWindowAdapter adapter = new MyWindowAdapter(null);
		this.addWindowListener(adapter);
	}
	
	class MyWindowAdapter extends WindowAdapter {
		MenuFrameDemo menuFrame;
		
		public MyWindowAdapter(MenuFrameDemo menuFrame){
			this.menuFrame = menuFrame;
		}
		
		public void windowClosing(WindowEvent e){
			menuFrame.setVisible(false);
		}
	}//end of class MyWindowAdapter
	
	class MyMenuHandler implements ActionListener,ItemListener{
		MenuFrameDemo menuFrame;
		

		public MyMenuHandler(MenuFrameDemo menuFrame) {
			this.menuFrame = menuFrame;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			menuFrame.repaint();
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			String msg = "you selected";
			String args = ae.getActionCommand();
			if (args.equals("New...")) {
				msg += "New...";
			}else if (args.equals("Open...")) {
				msg += "Open...";								
			}
			menuFrame.msg = msg;
			menuFrame.repaint();
		}

	}//end of class MyMenuHandler

}
