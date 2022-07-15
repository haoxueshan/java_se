package Demo02;

import java.awt.*;

import javax.swing.Box;

public class BasicComponenDemo {

	Frame frame=new Frame("文本测试组件");
	
	TextArea ta=new TextArea(5,20);
	
	Choice color=new Choice();
	
	CheckboxGroup cbg=new CheckboxGroup();
	
	Checkbox male=new  Checkbox("男",cbg,true);
	
	Checkbox femle=new  Checkbox("女",cbg,false);
	
	Checkbox isMarried=new Checkbox("是否已婚");
	
	TextField tf=new TextField(20);
	
	Button ok=new Button("确认");
	List colorlist=new List(6,true);
	
	public void init() {
		Box bBox=Box.createHorizontalBox();
		bBox.add(tf);
		bBox.add(ok);
		
		frame.add(bBox,BorderLayout.SOUTH);
		
		color.add("红色");
		color.add("蓝色");
		color.add("绿色");
		
		Box cBox=Box.createHorizontalBox();
		cBox.add(color);
		cBox.add(male);
		cBox.add(femle);
		cBox.add(isMarried);
		
		Box topLeft=Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(cBox);
		
		colorlist.add("红色");
		colorlist.add("蓝色");
		colorlist.add("绿色");
		
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
