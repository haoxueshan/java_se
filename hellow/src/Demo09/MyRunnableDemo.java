package Demo09;

public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable m=new MyRunnable();
		
		Thread t1=new Thread(m,"����");
		Thread t2=new Thread(m,"�ɻ�");
		
		
		t1.start();
		t2.start();
	}

}
