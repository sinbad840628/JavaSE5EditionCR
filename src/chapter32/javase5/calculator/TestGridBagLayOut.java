package chapter32.javase5.calculator;

import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

public class TestGridBagLayOut extends JFrame{
	public void makebutton(JFrame frame, String name, GridBagLayout gridbag,  
            GridBagConstraints c) {  
        Button button = new Button(name);  
        gridbag.setConstraints(button, c);  
        c.fill = GridBagConstraints.BOTH;  
        frame.add(button);  
    }  
  
    public static void main(String[] args) {  
    	TestGridBagLayOut test = new TestGridBagLayOut();  
        JFrame frame = new JFrame("Test");  
        GridBagLayout gridbag = new GridBagLayout();  
        GridBagConstraints c = new GridBagConstraints();  
        frame.setSize(400, 200);  
        frame.setLayout(gridbag);  
        // 创建一个3*4的表格，前三个button为一行  
        test.makebutton(frame, "Button1", gridbag, c);  
        test.makebutton(frame, "Button2", gridbag, c);  
        c.gridwidth = GridBagConstraints.REMAINDER; // 第一行结束  
        test.makebutton(frame, "Button3", gridbag, c);  
        // 即将添加的button占两列宽度  
        c.gridwidth = 2;  
        test.makebutton(frame, "Button4", gridbag, c);  
        c.gridwidth = GridBagConstraints.REMAINDER; // 第二行结束  
        test.makebutton(frame, "Button5", gridbag, c);  
  
        // 即将添加的button占两行高度，一列宽度  
        c.gridheight = 2;  
        c.gridwidth = 1;// 每次使用完之后，记得要清除上次的状态，否则此时的gridwidth还是上次的GridBagConstraints.REMAINDER哦  
        test.makebutton(frame, "Button6", gridbag, c);  
  
        c.gridwidth = GridBagConstraints.REMAINDER; // 第三行结束  
        c.gridheight = 1;//重置占用的高度为1行高度  
        test.makebutton(frame, "Button7", gridbag, c);  
        test.makebutton(frame, "Button8", gridbag, c);  
  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}
