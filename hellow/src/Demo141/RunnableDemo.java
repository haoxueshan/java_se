package Demo141;

public class RunnableDemo {

	public static void main(String[] args) {
		StartThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"�߳�����");
			}
		});
		StartThread(()->System.out.println(Thread.currentThread().getName()+"�߳�����"));
	}
	private static void StartThread(Runnable r) {
		// TODO Auto-generated method stub

		new Thread(r).start();
	}
}
