package chapter32.javase5.calculator;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestGridBagLayout2 extends JFrame{

	private JTextField resultTextField1;
	private JTextField resultTextField2;
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
	
	public TestGridBagLayout2() {
		
		init();
		this.pack();
		this.setTitle("Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void init() {
		resultTextField1.setText("hello");
		resultTextField2.setText("World");
		button01 = new JButton("01");
		button02 = new JButton("02");
		button03 = new JButton("03");
		button04 = new JButton("04");
		button05 = new JButton("05");
		button06 = new JButton("06");
		button07 = new JButton("07");
		button08 = new JButton("08");
		button09 = new JButton("09");
		button10 = new JButton("10");
		button11 = new JButton("11");
		button12 = new JButton("12");
		button13 = new JButton("13");
		button14 = new JButton("14");
		button15 = new JButton("15");
		button16 = new JButton("16");
		button17 = new JButton("17");
		button18 = new JButton("18");
		button19 = new JButton("19");
		button20 = new JButton("20");
		button21 = new JButton("21");
		button22 = new JButton("22");
		button23 = new JButton("23");
		button24 = new JButton("24");
		GridBagLayout bagLayout = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 1; // ★ 设 置 第 一 个 按钮 的 大小
        gbc.gridheight = 1; // ★
        Button Button1 = new Button(" 东 ");
        ((GridBagLayout)getLayout( )).setConstraints(Button1,gbc);
        add(Button1);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        // ★ 第 二 个 按 钮 填 满 整 行 空 间
        Button Button2 = new Button(" 西 ");
        ((GridBagLayout)getLayout( )).setConstraints(Button2,gbc);
       add(Button2);
        gbc.gridheight = 4; // 设 置 第 三 个 按钮 的 大小
        gbc.gridwidth = 1;
       Button Button3 = new Button(" 南 ");
       ((GridBagLayout)getLayout( )).setConstraints(Button3,gbc);
        add(Button3);
        gbc.gridheight = 2; // 设 置 第 四 个 按钮 的 大小
        gbc.gridwidth = 2; // GridBagConstraints.REMAINDER;
       Button Button4 = new Button(" 北 ");
        ((GridBagLayout)getLayout( )).setConstraints(Button4,gbc);
        add(Button4);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        Button Button5 = new Button(" 中 ");
        ((GridBagLayout)getLayout( )).setConstraints(Button5,gbc);
       add(Button5);
        //gbc.insets = new Insets(5,6,7,8); // ★ 设置第 五 个 按 钮 的 位 置
        Button Button6 = new Button(" 好 酒 在张弓 ");
        ((GridBagLayout)getLayout( )).setConstraints(Button6,gbc);
        add(Button6);
        this.pack();
		this.setTitle("Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		TestGridBagLayout2 gb = new TestGridBagLayout2();
		gb.init();
	}
}
