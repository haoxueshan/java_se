package Demo091;

public class SellTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellTicet st=new SellTicet();
		Thread t1=new Thread(st,"����һ");
		Thread t2=new Thread(st,"���ڶ�");
		Thread t3=new Thread(st,"������");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
