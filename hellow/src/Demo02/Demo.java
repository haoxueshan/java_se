package Demo02;

public class Demo {

	public static void main(String[] args) {
		Animal a=new Cat();
		a.setName("�ӷ�");
		a.setAge(30);
		System.out.println(a.name+a.getAge());
		a.eat();
		
		Animal b=new Dog();
		b.setName("����");
		b.setAge(34);
		System.out.println(b.name+b.getAge());
		b.eat();
	}
}
