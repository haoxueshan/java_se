package Demo01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.TextField;

public class ScrollpaneDemo {

	public static void main(String[] args) {
		Frame frame=new Frame("ScrollPane");
		
		
		ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
		sp.add(new TextField("�ı�����"));
		sp.add(new Button("��ť"));
		
		frame.add(sp);
		
		frame.setBounds(100,100, 500, 300);
		frame.setVisible(true);
	}
}
