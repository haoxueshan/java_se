package Demo11;

public class LambdaDemo {

	public static void main(String[] args) {
//		MyRunnable m=new MyRunnable();
//		Thread t=new Thread(m);
//		t.start();
		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("多线程程序");
//			}
//		}).start();
		useEatable(()->{
			System.out.println("Lambda表达式");
		});
	}

	private static void useEatable(Eatable e) {
		// TODO Auto-generated method stub
		e.eat();
		
	}
}
