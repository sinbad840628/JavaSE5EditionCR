package chapter32.javase5.calculator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestGridLayout extends JFrame {
	private static final long serialVersionUID = 6819222900970457455L;
	private JTextField resultTextField;
	private JButton button01;
	private JButton button02;
	private JButton button03;
	private JButton button04;
	private JButton button05;
	private JButton button06;
	private JButton button07;
	private JButton button08;
	private JButton button09;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton button19;
	private JButton button20;
	private JButton button21;
	private JButton button22;
	private JButton button23;
	private JButton button24;
	private JFrame frame;


	public void init() {		

		GridBagLayout gridBagLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();

		frame.setLayout(gridBagLayout);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridheight = 5;
		gbc.gridwidth = 1;		
        this.add(resultTextField);
        gbc.gridheight = 0;
		gbc.gridwidth = 0;	
		this.add(button01);
		this.add(button02);
		this.add(button03);
		this.add(button04);
		this.add(button05);
		this.add(button06);
		this.add(button07);
		this.add(button08);
		this.add(button09);
		this.add(button10);
		this.add(button11);
		this.add(button12);
		this.add(button13);
		this.add(button14);
		this.add(button15);
		this.add(button16);
		this.add(button17);
		this.add(button18);
		this.add(button19);
		this.add(button20);
		this.add(button21);
		this.add(button22);
		this.add(button23);
		this.add(button24);
	}

	public static void main(String args[]) {
		TestGridLayout test = new TestGridLayout();
		test.init();
	}
}
