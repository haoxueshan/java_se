package hellow;

public class Demo072 {
	public static void main(String[] args) {
		Demo07 p=new Demo07();
		System.out.println(p.brand);
		System.out.println(p.price);
		
		p.brand="ะกรื";
		p.price=2999;
		System.out.println(p.brand);
		System.out.println(p.price);
		
		p.call();
		p.sendMessage();
		
	}

}
