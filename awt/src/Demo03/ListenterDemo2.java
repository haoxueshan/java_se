package Demo03;

import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;

public class ListenterDemo2 {

	public static void main(String[] args) {
		Frame frame=new Frame("’‚¿Ô≤‚ ‘º‡Ã˝∆˜");
		frame.setBounds(200,200,500,300);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		frame.pack();
		frame.setVisible(true);
	}
}
