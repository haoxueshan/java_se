package Demo031;

public class PingpangCoach extends Coach implements SpeakEnglish {

	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("ƹ���������ţ��");
		
	}public PingpangCoach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PingpangCoach(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("ƹ��������̴�ƹ����");
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("ƹ�������˵Ӣ��");
	}
}
