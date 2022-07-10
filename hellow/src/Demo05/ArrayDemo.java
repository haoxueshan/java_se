package Demo05;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr= {26,36,78,54};
		System.out.println("≈≈–Ú«∞"+Arrays.toString(arr));
		System.out.println();   
		for(int i=0;i<arr.length;i++) {
			for(int x=0;x<arr.length-1-i;x++) {
				if(arr[x]<arr[x+1]) {
					int temp=arr[x];
					arr[x]=arr[x+1];
					arr[x+1]=temp;
				}
			}
		}
		System.out.println(arrayToString(arr));
	}
	public static String arrayToString(int[] arr) {
		StringBuilder sb=new StringBuilder();
		sb.append("[");
		for(int i=0;i<arr.length;i++) {
			if(i == arr.length-1) {
				sb.append(arr[i]);
			}else {
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String s=sb.toString();
		return s;
	}
}
