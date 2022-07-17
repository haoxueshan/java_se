package Demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialogDemo {

	public static void main(String[] args) {
		Frame frame = new Frame("这里测试Dialog");

		FileDialog f1 = new FileDialog(frame, "选择要打开的文件", FileDialog.LOAD);
		FileDialog f2 = new FileDialog(frame, "选择要保存的文件", FileDialog.SAVE);

		Button b1 = new Button("打开文件");
		Button b2 = new Button("保存文件");

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f1.setVisible(true);

				String directory = f1.getDirectory();
				String file = f1.getFile();

				System.out.println("打开文件路径为" + directory);
				System.out.println("打开文件名称为" + file);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f2.setVisible(true);

				String directory = f2.getDirectory();
				String file = f2.getFile();

				System.out.println("保存文件路径为" + directory);
				System.out.println("保存文件名称为" + file);

			}
		});
		frame.add(b1,BorderLayout.NORTH);
		frame.add(b2);

		frame.pack();
		frame.setVisible(true);
	}
}
