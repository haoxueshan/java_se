package hellow;

public class Demo055 {

	public static void main(String[] args) {
		System.out.print(isNumber(12));
	}
	public static boolean isNumber(int number) {
		if(number % 2 == 0) {
			return true;
		}else {
			return false;
		}
	}
}
