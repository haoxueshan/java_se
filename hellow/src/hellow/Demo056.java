package hellow;

public class Demo056 {

	public static void main(String[] args) {
		int ret1=sum(1,2);
		System.out.println(ret1);
		double ret2=sum(1,2);
		System.out.println(ret2);
		int ret3=sum(1,2,3);
		System.out.println(ret3);
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double sum(double a,double b) {
		return a+b;
	}
	public static int sum(int a, int b,int c) {
		return a+b+c;
	}
}
