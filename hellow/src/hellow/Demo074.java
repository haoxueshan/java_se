package hellow;

public class Demo074 {

	private String name;
	private int age;
	
	
	public Demo074() {
		System.out.println("无参构造方法");
	}
	
	public Demo074(String name) {
		this.name=name;
	}
	
	public Demo074(int age) {
		this.age=age;
	}
	public Demo074(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setAge(int age) {
		
		
		if (age<0||age>120) {
			System.out.println("输入的年龄不对");
		}else {
			this.age=age;
		}
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void show() {
		System.out.println(name+","+age);
	}
	
}
