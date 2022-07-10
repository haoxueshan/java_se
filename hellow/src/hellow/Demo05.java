package hellow;
//main方法是程序入口的方法
/*
 * 格式
 * 方法名()
 * 案例
 * isNumber()
 */
public class Demo05 {
	public static void main(String[] args) {
		isNumber();
	}
	public static  void isNumber() {
		int number =10;
		if(number % 2 == 0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
