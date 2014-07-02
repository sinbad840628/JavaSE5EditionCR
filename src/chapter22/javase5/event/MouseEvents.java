package chapter22.javase5.event;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class MouseEvents extends Applet implements 
									MouseListener,MouseMotionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "";
	int mouseX = 0;
	int mouseY = 0;
	
	public void init(){
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "*";
		showStatus(" Dragging mouse at " + mouseX + "," + mouseY);
		repaint();		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		showStatus("Moving mouse at " + e.getX() + "," + e.getY()  );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse clicked!";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Mouse Pressed";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		msg = "Mouse Released";
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse Entered!";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited!";
		repaint();
	}
	
	public void paint(Graphics g){
		g.drawString(msg, mouseX, mouseY);
	}
}
