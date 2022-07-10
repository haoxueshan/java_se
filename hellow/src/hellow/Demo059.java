package hellow;
//Êı×é±éÀú
public class Demo059 {

	public static void main(String[] args) {
		int[] arr= {11,55,22,33,66};
		printarr(arr);
	}
	public static void printarr(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				System.out.print(arr[i]);
				System.out.print(",");
			}else {
				System.out.print(arr[i]);
			}
			
			
		}
		System.out.print("]");
		
	}
}
