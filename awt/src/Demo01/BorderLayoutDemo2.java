package Demo01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayoutDemo2 {

	public static void main(String[] args) {
		Frame frame = new Frame("borderLayout");

		frame.add(new Button("��"), BorderLayout.NORTH);
		frame.add(new Button("��"), BorderLayout.SOUTH);
		frame.add(new Button("��"), BorderLayout.CENTER);
		frame.add(new TextField("�ı�"));
		Panel p=new Panel();

		p.add(new Button("�м䰴ť"));
		p.add(new TextField("�����ı���"));
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
	}
}
