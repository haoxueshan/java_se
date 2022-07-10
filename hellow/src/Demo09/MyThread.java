package Demo09;

public class MyThread extends Thread {

	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public MyThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		for(int i=0;i<99;i++) {
			System.out.println(getName()+","+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
