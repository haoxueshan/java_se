package Demo031;

public class PersionDemo {

	public static void main(String[] args) {
		PingpongPlayer pp=new PingpongPlayer();
		pp.setAge(30);
		pp.setName("����");
		System.out.println(pp.getAge()+pp.getName());
		pp.speak();
		pp.study();
		System.out.println("-------");
		
		BasketetballCoach bbb=new BasketetballCoach();
		bbb.setAge(54);
		bbb.setName("Ҧ��");
		System.out.println(bbb.getAge()+bbb.getName());
		bbb.eat();
		bbb.teach();
	}
}
