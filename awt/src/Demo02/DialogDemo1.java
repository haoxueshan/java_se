package Demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;


public class DialogDemo1 {

	public static void main(String[] args) {
		Frame frame=new Frame("这里测试Dialog");
		
		Dialog d1=new Dialog(frame,"模式对话框",true);
	
		Box vbox = Box.createHorizontalBox();
		vbox.add(new TextField(20));
		vbox.add(new Button("确定"));
		d1.add(vbox);
		d1.setBounds(20,30,300,200);
		
		
		Button b1=new Button("打开模式对话框");
		
		

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d1.setVisible(true);
			}
		});
		

		frame.add(b1,BorderLayout.NORTH);

		
		frame.pack();
		frame.setVisible(true);
	}
}
