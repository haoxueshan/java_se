package hellow;

public class Demo084 {

	public static void main(String[] args) {
		StringBuilder sd=new StringBuilder();
		System.out.println("sd"+sd);
		System.out.println("sd.lenght()"+sd.length());
		
//		StringBuilder sd2=new StringBuilder("hello");
//		System.out.println("sd2"+sd2);
//		System.out.println("sd2.lenght()"+sd2.length());
		
		sd.append("hello");
		sd.append("world");
		System.out.println("sd:"+sd);
		//?ַ?????ת
		sd.reverse();
		System.out.println("sd:"+sd);
	}
}
