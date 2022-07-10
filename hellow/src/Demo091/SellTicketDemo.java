package Demo091;

public class SellTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SellTicet st=new SellTicet();
		Thread t1=new Thread(st,"窗口一");
		Thread t2=new Thread(st,"窗口二");
		Thread t3=new Thread(st,"窗口三");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
