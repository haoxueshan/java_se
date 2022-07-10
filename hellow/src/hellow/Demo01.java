package hellow;

//导入数据输入包
import java.util.Random;
import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int number=rd.nextInt(100)+1;
		System.out.println(number);
		while(true) {
			
			System.out.println("数据接收");
			
			int a=sc.nextInt();
			if(a>number) {
				System.out.println("猜大了");
			}else if(a<number){
				System.out.println("小了");			
			}else {
				System.out.println("对了");
				break;
			}
		}
	}

}
