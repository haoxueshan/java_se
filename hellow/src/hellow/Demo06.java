package hellow;
//����Ĳ���
import java.util.Scanner;
public class Demo06 {

	public static void main(String[] args) {
		int[] arr= {19,34,68,34};
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
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
