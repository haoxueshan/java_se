package Demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;


public class DialogDemo1 {

	public static void main(String[] args) {
		Frame frame=new Frame("�������Dialog");
		
		Dialog d1=new Dialog(frame,"ģʽ�Ի���",true);
	
		Box vbox = Box.createHorizontalBox();
		vbox.add(new TextField(20));
		vbox.add(new Button("ȷ��"));
		d1.add(vbox);
		d1.setBounds(20,30,300,200);
		
		
		Button b1=new Button("��ģʽ�Ի���");
		
		

		
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
