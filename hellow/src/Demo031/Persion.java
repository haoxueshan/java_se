package Demo031;

public abstract class Persion {

	private String name;
	private int age;
	
	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persion(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void eat() ;
	
}
