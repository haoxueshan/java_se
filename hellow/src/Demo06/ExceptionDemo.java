package Demo06;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入分数");
		
		int score=sc.nextInt();
		Teacher t=new Teacher();
		try {
			t.checkScore(score);
		} catch (ScoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("开始");
		method();
		
		System.out.println("结束");
	}
	private static void method() {
		// TODO Auto-generated method stub
		try {
			int[] arr= {1,2,3};
			System.out.println(arr[3]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		

	}
}
