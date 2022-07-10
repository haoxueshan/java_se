package Demo08;

public class DiGuiDemo {

	public static void main(String[] args) {

		int[] arr = new int[20];
		System.out.println(f(20));
		System.out.println(jc(5));
		System.out.println(f1(4));
	}

	public static int f(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}

	public static int jc(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * jc(i - 1);
		}
	}

	public static int f1(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if(n==3)
			return 4;
		return f1(n - 1) + f1(n - 2)+f1(n-3);
	}
}
