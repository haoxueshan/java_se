package Demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DialogDemo2 {

	public static void main(String[] args) {
		Frame frame=new Frame("�������Dialog");
		
		Dialog d1=new Dialog(frame,"ģʽ�Ի���",true);
		Dialog d2=new Dialog(frame,"��ģʽ�Ի���",false);
		
		Button b1=new Button("��ģʽ�Ի���");
		Button b2=new Button("��ģʽ�Ի���");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d1.setVisible(true);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				d2.setVisible(false);
			}
		});
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2);
		
		frame.pack();
		frame.setVisible(true);
	}
}
