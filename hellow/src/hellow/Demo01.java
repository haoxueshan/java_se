package hellow;

//�������������
import java.util.Random;
import java.util.Scanner;
public class Demo01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int number=rd.nextInt(100)+1;
		System.out.println(number);
		while(true) {
			
			System.out.println("���ݽ���");
			
			int a=sc.nextInt();
			if(a>number) {
				System.out.println("�´���");
			}else if(a<number){
				System.out.println("С��");			
			}else {
				System.out.println("����");
				break;
			}
		}
	}

}
