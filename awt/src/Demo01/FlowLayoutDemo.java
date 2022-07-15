package Demo01;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame=new Frame("≤‚ ‘FlowLayout");
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		
		for(int i=1;i<100;i++) {
			frame.add(new Button("∞¥≈•"+i));
			
		}
		frame.pack();
		frame.setVisible(true);
		
	}

}
