package Demo01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridBagLayoutDemo {

	public static void main(String[] args) {
		Frame frame=new Frame("GridBagLayoutDemo");
		
		Panel p1=new Panel();
		
		CardLayout cardlayout=new CardLayout();
		p1.setLayout(cardlayout);
		
		String[] names= {"��һ��","�ڶ���","������","������","������"};
		
		for(int i=0;i<names.length;i++) {
			p1.add(names[i],new Button(names[i]));
		}
		
		frame.add(p1);
		
		Panel p2=new Panel();
		
		Button b1 = new Button("��һ��");
		Button b2 = new Button("��һ��");
		Button b3 = new Button("��һ��");
		Button b4 = new Button("��һ��");
		Button b5 = new Button("������");
		
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String actionCommand=e.getActionCommand();
				
				switch (actionCommand) {
				case "��һ��":
					cardlayout.previous(p1);
					break;
				case "��һ��":
					cardlayout.next(p1);
					break;
				case "��һ��":
					cardlayout.first(p1);
					break;
				case "��һ��":
					cardlayout.last(p1);
					break;
				case "������":
					cardlayout.show(p1, "������");
					break;

				}
			}
		};
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		
		frame.add(p2,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
