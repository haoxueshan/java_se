package Demo03;

import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.Box;

public class ListenterDemo1 {

	public static void main(String[] args) {
		Frame frame=new Frame("这里测试监听器");
		
		TextField tf=new TextField(30);
		
		Choice names=new Choice();
		names.add("刘岩");
		names.add("舒淇");
		names.add("闫妮");
		
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				// TODO Auto-generated method stub
				String text = tf.getText();
				System.out.println("文本框内容是"+text);
			}
		});
		
		names.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				Object itme=e.getItem();
				System.out.println("选中的条目为"+itme);
				
			}
		});
		frame.addContainerListener(new ContainerListener() {
			
			@Override
			public void componentRemoved(ContainerEvent e) {
				// TODO Auto-generated method stub
				Component child = e.getChild();
				System.out.println(child);
			}
			
			@Override
			public void componentAdded(ContainerEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		Box hbox=Box.createHorizontalBox();
		hbox.add(names);
		hbox.add(tf);
		frame.add(hbox);
		frame.pack();
		frame.setVisible(true);
	}
}
