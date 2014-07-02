package chapter32.javase5.calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	JFrame frame;
	JMenu m_View_Menu,m_Edit_Menu,m_Help_Menu;
	
	JMenuItem m_Standard_Item,m_Programmer_Item;
	JMenuItem m_Copy_Item,m_Paste_Item;
	JMenuItem m_View_Help,m_About_Calculator;
	
	JTextField tResult;
	
	JButton bNumberButton;
	JButton bOperatorButton;
	JButton mc_Button,mr_Button,ms_Button,mplus_Button,msurplus_Button;
	
	boolean isDouble = false;
	
	public Calculator(){
		frame = new JFrame("Sinbad's Calculator");
		Container contentPane = frame.getContentPane();
		
		JPanel pLeft = new JPanel();
        pLeft.setLayout(new GridLayout(5,6,3,3));
		
		/*=================Create Menu==========================*/
		JMenuBar mBar = new JMenuBar();
		mBar.setOpaque(true);
		m_View_Menu = new JMenu("View");
		m_View_Menu.setMnemonic(KeyEvent.VK_V);
		
		/*=================Create Function Button==========================*/
		mc_Button = new JButton("MC");
		mc_Button.addActionListener(this);
		mc_Button.setForeground(Color.red);
        
		/*=================Create Number Button==========================*/
		
		/*=================Create Calculate function==========================*/
        
        /*=================Create Layout==========================*/
        frame.pack();
        //frame.setResizable(false);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        }
        );
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) { 
        new Calculator(); 
    }
	
}
