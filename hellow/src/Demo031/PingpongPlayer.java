package Demo031;

public class PingpongPlayer extends Player implements SpeakEnglish{

	
	public PingpongPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PingpongPlayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动元吃牛肉");
		
	}@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员说英语");
		
	}@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("乒乓球运动员学习打乒乓球");
		
	}
	
}
