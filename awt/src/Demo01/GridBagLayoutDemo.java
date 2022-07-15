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
		
		String[] names= {"第一张","第二张","第三张","第四张","第五张"};
		
		for(int i=0;i<names.length;i++) {
			p1.add(names[i],new Button(names[i]));
		}
		
		frame.add(p1);
		
		Panel p2=new Panel();
		
		Button b1 = new Button("上一张");
		Button b2 = new Button("下一张");
		Button b3 = new Button("第一张");
		Button b4 = new Button("最一张");
		Button b5 = new Button("第三张");
		
		ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String actionCommand=e.getActionCommand();
				
				switch (actionCommand) {
				case "上一张":
					cardlayout.previous(p1);
					break;
				case "下一张":
					cardlayout.next(p1);
					break;
				case "第一张":
					cardlayout.first(p1);
					break;
				case "最一张":
					cardlayout.last(p1);
					break;
				case "第三张":
					cardlayout.show(p1, "第三张");
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
