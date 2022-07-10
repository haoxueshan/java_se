package hellow;

public class Demo023 {
	
	public static void main(String[] args) {
		int[] arr= {12,45,96,76};
		
		int max=arr[0];
		for(int x=1;x<arr.length;x++) {
			if(arr[x]>max) {
				max=arr[x];
			}
		}
		System.out.println("max:"+ max);
		
	}
}
