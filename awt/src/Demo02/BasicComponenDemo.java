package Demo02;

import java.awt.*;

import javax.swing.Box;

public class BasicComponenDemo {

	Frame frame=new Frame("�ı��������");
	
	TextArea ta=new TextArea(5,20);
	
	Choice color=new Choice();
	
	CheckboxGroup cbg=new CheckboxGroup();
	
	Checkbox male=new  Checkbox("��",cbg,true);
	
	Checkbox femle=new  Checkbox("Ů",cbg,false);
	
	Checkbox isMarried=new Checkbox("�Ƿ��ѻ�");
	
	TextField tf=new TextField(20);
	
	Button ok=new Button("ȷ��");
	List colorlist=new List(6,true);
	
	public void init() {
		Box bBox=Box.createHorizontalBox();
		bBox.add(tf);
		bBox.add(ok);
		
		frame.add(bBox,BorderLayout.SOUTH);
		
		color.add("��ɫ");
		color.add("��ɫ");
		color.add("��ɫ");
		
		Box cBox=Box.createHorizontalBox();
		cBox.add(color);
		cBox.add(male);
		cBox.add(femle);
		cBox.add(isMarried);
		
		Box topLeft=Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(cBox);
		
		colorlist.add("��ɫ");
		colorlist.add("��ɫ");
		colorlist.add("��ɫ");
		
		Box top=Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorlist);
		
		frame.add(top);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new BasicComponenDemo().init();
	}
}
