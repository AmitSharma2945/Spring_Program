package com.nt.test;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nSpringTest01 {

	public static void main(String[] args) {
	    ApplicationContext ctx=null;
	    Locale locale=null;
	    String msg1=null,msg2=null,msg3=null,msg4=null;
		String titel=null;
	    JFrame jf=null;
	    JButton btn1=null,btn2=null,btn3=null,btn4=null,btn5=null; 
        NumberFormat nFormat=null;
        String regfee=null;
	    long fees=123456789L;
	    
	    //create container
	    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
	    //locale object
	    locale=new Locale(args[0],args[1]);
	
	    //nuMBER format
	    nFormat=NumberFormat.getInstance(locale);
	    nFormat=NumberFormat.getCurrencyInstance(locale);
	    regfee=nFormat.format(fees);
	
	    //locale get message
	    titel=ctx.getMessage("screen.titel",new Object[]{},"caption1",locale);
	    msg1=ctx.getMessage("btn1.cap",new Object[]{},"caption1",locale);
	    msg2=ctx.getMessage("btn2.cap", new Object[]{}, "caption2", locale);
	    msg3=ctx.getMessage("btn3.cap", new Object[]{}, "caption3", locale);
	    msg4=ctx.getMessage("btn4.cap", new Object[]{}, "caption4", locale);
	    //add jframe window
	    jf=new JFrame();
		jf.setLayout(new FlowLayout());
		jf.setSize(200,200);
		jf.setTitle(titel);
		//jbutton 
		btn1=new JButton(msg1);
		jf.add(btn1);
		btn2=new JButton(msg2);
		jf.add(btn2);
		btn3=new JButton(msg3);
		jf.add(btn3);
		btn4=new JButton(msg4);
		jf.add(btn4);
		
		btn5=new JButton(regfee);
		jf.add(btn5);
		
		jf.pack();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ((AbstractApplicationContext) ctx).close();
	     
	}
}
