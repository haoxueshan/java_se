package hellow;

//两个数组内容的交换
public class Demo062 {

	public static void main(String[] args) {
		int[] arr= {13,78,65,635,45};
		
		for(int start=0,end=arr.length-1;start<=end;start++,end--) {
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
		printarr(arr);
	}
	public static void printarr(int[] arr) {
		System.out.print("[");
		for (int x=0;x<arr.length;x++) {
			if(x==arr.length-1) {
				System.out.print(arr[x]);
			}else {
				System.out.print(arr[x]+",");
			}
		}
		System.out.print("]");
	}
}
