package hellow;

import java.util.Scanner;

public class Demo082 {

	public static void main (String[] args) {
		String username="qwe";
		String password="123";
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("�������û���:");
			String name=sc.nextLine();
			
			System.out.println("����������:");
			String pwd=sc.nextLine();
			
			if(name.equals(username) && pwd.equals(password)) {
				System.out.println("������ȷ");
				break;
			}else {
				if(i!=2) {
					System.out.println("���������"+(2-i)+"��");
				}else {
					System.out.println("�������û������");
				}
			}
		}
	}
}
