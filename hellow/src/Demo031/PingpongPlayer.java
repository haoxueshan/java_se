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
		System.out.println("ƹ�����˶�Ԫ��ţ��");
		
	}@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Ա˵Ӣ��");
		
	}@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�����˶�Աѧϰ��ƹ����");
		
	}
	
}
