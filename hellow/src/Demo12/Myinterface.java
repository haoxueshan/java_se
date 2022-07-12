package Demo12;

public interface Myinterface {

	void show1();

	void show2();

	default void show3() {
		System.out.println("show3");
	}
}
