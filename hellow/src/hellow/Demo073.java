package hellow;

public class Demo073 {

	private String name;
	private int age;
	
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
		System.out.println("姓名："+name+" 年龄:"+age);
	}
}
