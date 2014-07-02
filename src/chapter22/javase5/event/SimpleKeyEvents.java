package chapter22.javase5.event;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKeyEvents extends Applet implements KeyListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg = "";
	int X = 10;
	int Y = 20;
	
	public void init(){
		addKeyListener(this);
		requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		showStatus("key Pressed!");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		showStatus("key Released!");
	}

	public void paint(Graphics g){
		g.drawString(msg, X, Y);
	}

}
