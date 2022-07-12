package Demo121;

public interface Inter {

	void show();
	default void method() {
		System.out.println("Inter默认方法");
	}
	static void text() {
		System.out.println("Inter静态方法");
	}
}
