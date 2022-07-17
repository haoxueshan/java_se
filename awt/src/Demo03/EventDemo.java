package Demo03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {

	Frame frame=new Frame("这里测试事件处理");
	
	Button ok=new Button("确定");
	
	TextField tf=new TextField(30);
	
	public void init() {
		
		MyListenner myListenner = new MyListenner();
		
		ok.addActionListener(myListenner);
		frame.add(tf,BorderLayout.NORTH);
		frame.add(ok);
		frame.pack();
		frame.setVisible(true);
	}
	private class MyListenner implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			tf.setText("Hello world");
		}
		
	} 
	public static void main(String[] args) {
		new EventDemo().init();;
	}
}
