package Demo01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class GridLayoutDemo {

	public static void main(String[] args) {
		Frame frame=new Frame("GridLayoutDemo");
		
		Panel p=new Panel();
		
		p.add(new TextField(30));
		
		frame.add(p,BorderLayout.NORTH);
		
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(3,5,5,4));
		
		for(int i=0;i<10;i++) {
			p2.add(new Button(i+""));
		}
		p2.add(new Button("+"));
		p2.add(new Button("-"));
		p2.add(new Button("*"));
		p2.add(new Button("/"));
		p2.add(new Button("."));
		
		
		frame.add(p2);
		
		frame.pack();
		frame.setVisible(true);
	}
}
