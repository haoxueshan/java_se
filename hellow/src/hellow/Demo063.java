package hellow;
import java.util.Scanner;

public class Demo063 {

	public static void main(String[] args) {
		int[] arr=new int[6];
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("请输入第"+(i+1)+"个评委打分");
			 arr[i]=sc.nextInt();
		 }
		 int max=getmax(arr);
		 int main=getmain(arr);
		 int sum=getsum(arr);
		 float avg=(sum-max-main)/(arr.length-2);
		 
		 System.out.println("平均分是："+avg);
	}
	public static int getmax(int[] arr) {
		int max=arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		return max;
	}
	public static int getmain(int[] arr) {
		int main=arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]<main) {
				main=arr[x];
			}
		}
		return main;
	}
	
	public static int getsum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	} 
}
