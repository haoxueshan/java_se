package Demo07;

public class Daneric<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void show(T t) {
		// TODO Auto-generated method stub

		System.out.println(t);
	}

}
