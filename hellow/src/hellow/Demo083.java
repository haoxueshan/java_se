package hellow;

import java.util.Scanner;
//�ַ�����ת
public class Demo083 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����һ���ַ���");
		String line=sc.nextLine();
		
		String ss=revs(line);
		System.out.println(ss);
	}
	public static String revs(String s) {
		String ss="";
		for (int i=s.length()-1;i>=0;i--) {
			ss+=s.charAt(i);
		}
		return ss;
	}  
}
