package hellow;

public class Demo073 {

	private String name;
	private int age;
	
	public void setAge(int age) {
		
		
		if (age<0||age>120) {
			System.out.println("��������䲻��");
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
		System.out.println("������"+name+" ����:"+age);
	}
}