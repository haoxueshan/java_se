package Demo141;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		String s=getString(()->"¡÷«‡œº");
		System.out.println(s);
	}
	private static String getString(Supplier<String> sup) {
		// TODO Auto-generated method stub
		return sup.get();

	}
}
