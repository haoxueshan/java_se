package hellow;
//数组的查找
import java.util.Scanner;
public class Demo06 {

	public static void main(String[] args) {
		int[] arr= {19,34,68,34};
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int number =sc.nextInt();
		int index=-1;
		
		for (int x=0;x<arr.length;x++) {
			if(arr[x]==number) {
				index=x;
				break;
			}
		}
		System.out.println("index:"+index);
	}
}
