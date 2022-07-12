package Demo13;

public class PrintableDemo {

	public static void main(String[] args) {
		useprint(System.out::println);
	}
	private static void useprint(Printable p) {
		// TODO Auto-generated method stub
		p.printInt(666);

	}
}
