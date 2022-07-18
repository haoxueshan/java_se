package Demo04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class PinBall {

	private Frame frame=new Frame("µ¯ÇòÓÎÏ·");
	private final int TABLE_WIDTH=300;
	private final int TABLE_HEIGHT=400;
	
	private final int RACKET_WIDTH=60;
	private final int RACKET_HEIGHT=20;
	
	private final int BALL_SIZE=16;
	
	private int ballX=120;
	private int ballY=20;
	
	private int speedY=10;
	private int speedX=5;
	
	private int racketX=120;
	private final int racketY=340;
	
	private boolean isOver=false;
	
	private Timer timer;
	
	private class MyCanves extends Canvas{
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			if(isOver) {
				g.setColor(Color.BLUE);
				g.setFont(new Font("Times",Font.BOLD,30));
				g.drawString("ÓÎÏ·½áÊø", 50, 200);
			}else {
				g.setColor(Color.RED);
				g.fillOval(ballX, ballY, BALL_SIZE, BALL_SIZE);
				g.setColor(Color.PINK);
				g.fillRect(ballX, ballY,RACKET_WIDTH,RACKET_HEIGHT);
			}
		}
	}
	
	MyCanves drawArca=new MyCanves();
	
	public void init() {
		KeyListener listener=new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode=e.getKeyCode();
				if(keyCode==KeyEvent.VK_LEFT) {
					if (racketX>0) {
						racketX-=10;
					}
				}
				if(keyCode==KeyEvent.VK_RIGHT) {
					if(racketX<(TABLE_WIDTH-RACKET_WIDTH)) {
						racketX+=10;
					}
				}
			}
		};
		frame.addKeyListener(listener);
		drawArca.addKeyListener(listener);

		
		ActionListener task=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(ballX<=0||ballX>=(TABLE_WIDTH-BALL_SIZE)) {
					speedX=-speedX;
				}
				if(ballY<=0||(ballY>racketY-BALL_SIZE&&ballX>racketX&&ballX<racketX+RACKET_WIDTH)) {
					speedY=-speedY;
				}
				if(ballY>racketY-BALL_SIZE &&(ballX <racketX||ballX>racketX-RACKET_WIDTH )){
					
					timer.stop();
					isOver=true;
					drawArca.repaint();
				}
				
				ballX=speedX;
				ballY=speedY;
				drawArca.repaint();
			}
		};
		
		timer =new Timer(100,task);

		drawArca.setPreferredSize(new Dimension(TABLE_WIDTH,TABLE_HEIGHT));
		frame.add(drawArca);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new PinBall().init();
	}
}
