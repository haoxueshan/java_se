package Demo092;
//消费者类
public class Customer implements Runnable{

	private Box b;
	public Customer(Box b) {
		// TODO Auto-generated constructor stub
		this.b=b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			b.get();
		}
	}

}
