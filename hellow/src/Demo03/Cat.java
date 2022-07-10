package Demo03;

public class Cat extends Animal implements jumpping{

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("猫可以调高");
	}

}
