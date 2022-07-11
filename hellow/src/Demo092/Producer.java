package Demo092;
//生产者类
public class Producer implements Runnable{

	private Box b;
	public Producer(Box b) {
		// TODO Auto-generated constructor stub
		this.b=b;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			b.put(i);
		}
	}

}
