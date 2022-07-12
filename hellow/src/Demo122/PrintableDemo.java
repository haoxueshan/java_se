package Demo122;

public class PrintableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		usePrintable((String s)->{
			System.out.println(s);
		});
		usePrintable(System.out::println);
		
	}
	private static void usePrintable(printable p) {
		// TODO Auto-generated method stub

		p.printString("java");
	}

}
