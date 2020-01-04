package com.nt.test;

import java.awt.FlowLayout;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class I18L_InternationalTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		String title=null;
		String cap1=null,cap2=null,cap3=null,cap4=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null,btn5=null;
	    NumberFormat nformat=null;
		String fRegfee=null;
		long regfee=123456789L;
		//prepare locale object
		locale=new Locale(args[0],args[1]);
		//create bundle object
		bundle=ResourceBundle.getBundle("com/nt/commons/App",locale);
		//number format
		nformat=NumberFormat.getInstance(locale);
		nformat=NumberFormat.getCurrencyInstance(locale);
		fRegfee=nformat.format(regfee);
		
		//title=bundle.getString("screen.title");
		cap1=bundle.getString("btn1.cap");
		cap2=bundle.getString("btn2.cap");
		cap3=bundle.getString("btn3.cap");
		cap4=bundle.getString("btn4.cap");
		//create frame window
		frame=new JFrame("I18L Application");
		//frame.setTitle(title);
		frame.setSize(200, 200);
		frame.setLayout(new FlowLayout());
		//add Comps
		btn1=new JButton(cap1);
		frame.add(btn1);
		btn2=new JButton(cap2);
		frame.add(btn2);
		btn3=new JButton(cap3);
		frame.add(btn3);
			
  		btn4=new JButton(cap4);
		frame.add(btn4);

  		btn5=new JButton(fRegfee);
		frame.add(btn5);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
}
