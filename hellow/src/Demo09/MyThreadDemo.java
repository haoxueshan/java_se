package Demo09;

public class MyThreadDemo {

	public static void main(String[] args) {
		MyThread mt1=new MyThread("A");
		MyThread mt2=new MyThread("B");
		MyThread mt3=new MyThread("C");
		
//		mt1.run();
//		mt2.run();
//		mt1.setName("线程一");
//		mt2.setName("线程二");
		mt1.start();
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mt2.start();
		mt3.start();
	}
}
