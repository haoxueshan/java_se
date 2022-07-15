package Demo01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class BorderLayoutDemo2 {

	public static void main(String[] args) {
		Frame frame = new Frame("borderLayout");

		frame.add(new Button("北"), BorderLayout.NORTH);
		frame.add(new Button("南"), BorderLayout.SOUTH);
		frame.add(new Button("中"), BorderLayout.CENTER);
		frame.add(new TextField("文本"));
		Panel p=new Panel();

		p.add(new Button("中间按钮"));
		p.add(new TextField("测试文本框"));
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
	}
}
