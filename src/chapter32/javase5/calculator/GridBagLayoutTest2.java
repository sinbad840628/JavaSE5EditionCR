package chapter32.javase5.calculator;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutTest2 {
	JPanel panelTop = new JPanel();

	private void addButton(String arg0, GridBagLayout gridBag,
			GridBagConstraints constraints) {
		JButton btn = new JButton(arg0);
		gridBag.setConstraints(btn, constraints);
		panelTop.add(btn);
	}

	public GridBagLayoutTest2() {
		JFrame frm = new JFrame("GridBagLayout Test v1.0");
		GridBagLayout gridBag = new GridBagLayout();
		panelTop.setLayout(gridBag);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.weightx = 1;
		constraints.fill = GridBagConstraints.BOTH;
		this.addButton("Button0", gridBag, constraints);
		this.addButton("Button1", gridBag, constraints);
		this.addButton("Button2", gridBag, constraints);
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		this.addButton("Button3", gridBag, constraints);
		this.addButton("Button4", gridBag, constraints);
		constraints.gridwidth = GridBagConstraints.RELATIVE;// 倒数第二，后边一定要使用REMAINDER
		this.addButton("Button5", gridBag, constraints);
		constraints.gridwidth = GridBagConstraints.REMAINDER;// 倒数第一,下一个换行。
		this.addButton("Button6", gridBag, constraints);
		constraints.gridwidth = 1;
		constraints.gridheight = 2;
		constraints.weighty = 1.0;
		this.addButton("Button7", gridBag, constraints);
		constraints.weighty = 0.0;
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		constraints.gridheight = 1;
		this.addButton("Button8", gridBag, constraints);
		constraints.gridwidth = GridBagConstraints.RELATIVE;
		this.addButton("Button9", gridBag, constraints);
		this.addButton("Button10", gridBag, constraints);
		frm.add(panelTop);
		frm.setVisible(true);
		frm.setSize(500, 300);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new GridBagLayoutTest2();
	}
}
