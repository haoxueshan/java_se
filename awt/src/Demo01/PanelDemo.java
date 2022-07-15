package Demo01;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelDemo {

	public static void main(String[] args) {
		Frame frame=new Frame("panel");
		Panel p=new Panel();
		p.add(new TextField("文本框"));
		p.add(new Button("按钮"));
		frame.add(p);
		
		frame.setBounds(100,100, 500, 300);
		frame.setVisible(true);
	}
}
