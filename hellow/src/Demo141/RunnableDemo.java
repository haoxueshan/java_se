package Demo141;

public class RunnableDemo {

	public static void main(String[] args) {
		StartThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+"线程启动");
			}
		});
		StartThread(()->System.out.println(Thread.currentThread().getName()+"线程启动"));
	}
	private static void StartThread(Runnable r) {
		// TODO Auto-generated method stub

		new Thread(r).start();
	}
}
