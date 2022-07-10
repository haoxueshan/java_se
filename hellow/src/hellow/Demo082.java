package hellow;

import java.util.Scanner;

public class Demo082 {

	public static void main (String[] args) {
		String username="qwe";
		String password="123";
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("请输入用户名:");
			String name=sc.nextLine();
			
			System.out.println("请输入密码:");
			String pwd=sc.nextLine();
			
			if(name.equals(username) && pwd.equals(password)) {
				System.out.println("输入正确");
				break;
			}else {
				if(i!=2) {
					System.out.println("输入错误还有"+(2-i)+"次");
				}else {
					System.out.println("输入错误没机会了");
				}
			}
		}
	}
}
