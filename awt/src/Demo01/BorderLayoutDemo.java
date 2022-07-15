package Demo01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		Frame frame=new Frame("borderLayout");
		
		frame.add(new Button("��"),BorderLayout.NORTH);
		frame.add(new Button("��"),BorderLayout.SOUTH);
		frame.add(new Button("��"),BorderLayout.EAST);
		frame.add(new Button("��"),BorderLayout.WEST);
		frame.add(new Button("��"),BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}
