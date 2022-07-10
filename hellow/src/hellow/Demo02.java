package hellow;
import java.util.Scanner;
import java.util.Arrays;

public class Demo02 {
//—°‘Ò≈≈–Ú∑®
	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		String NumberArr=sc.next();
		int[] NumberArr={5,6,9,74,88,55,7};
 		for(int i=0;i<NumberArr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<NumberArr.length;j++) {
				if(NumberArr[index]<NumberArr[j]) {
					index=j;
				}
				int temp=NumberArr[index];
				NumberArr[index]=NumberArr[i];
				NumberArr[i]=temp;
				
			}
			
		}
		System.out.println(Arrays.toString(NumberArr));
		
	}
}
