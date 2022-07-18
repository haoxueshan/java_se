package Demo03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SimpleMenu {

	private Frame frame=new Frame("������Բ˵�������");
	
	MenuBar menubar=new MenuBar();
	Menu FileMenu=new Menu("�ļ�");
	Menu editMenu=new Menu("�༭");
	Menu fromMenu=new Menu("��ʽ");
	
	
	MenuItem auto=new MenuItem("�Զ�����");
	MenuItem copy=new MenuItem("����");
	MenuItem paste=new MenuItem("ճ��");
	
	
	MenuItem comment=new MenuItem("ע��",new MenuShortcut(KeyEvent.VK_Q,true));
	MenuItem cancelcomment=new MenuItem("ȡ��ע��");
	TextArea ta=new TextArea(6,40);
	public void init() {
		// TODO Auto-generated method stub
		
		comment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append("������˲˵�:"+e.getActionCommand()+"\n");
			}
		});
		fromMenu.add(comment);
		fromMenu.add(cancelcomment);
		
		editMenu.add(auto);
		editMenu.add(copy);
		editMenu.add(paste);
		editMenu.add(fromMenu);
		
		menubar.add(FileMenu);
		menubar.add(editMenu);
		frame.setMenuBar(menubar);
		frame.add(ta);

		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleMenu().init();
	}
	
}
