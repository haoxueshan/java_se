package Demo03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SimpleMenu {

	private Frame frame=new Frame("这里测试菜单相关组件");
	
	MenuBar menubar=new MenuBar();
	Menu FileMenu=new Menu("文件");
	Menu editMenu=new Menu("编辑");
	Menu fromMenu=new Menu("格式");
	
	
	MenuItem auto=new MenuItem("自动换行");
	MenuItem copy=new MenuItem("复制");
	MenuItem paste=new MenuItem("粘贴");
	
	
	MenuItem comment=new MenuItem("注释",new MenuShortcut(KeyEvent.VK_Q,true));
	MenuItem cancelcomment=new MenuItem("取消注释");
	TextArea ta=new TextArea(6,40);
	public void init() {
		// TODO Auto-generated method stub
		
		comment.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append("您点击了菜单:"+e.getActionCommand()+"\n");
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
