package Demo092;
//奶箱
public class Box {

	private int milk;
	
	private boolean state=false;
	
	public synchronized void put(int milk) {
		// TODO Auto-generated method stub
		if(state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.milk=milk;
		System.out.println("送奶工将第"+this.milk+"送入奶箱");
		state=true;
		notifyAll();
	}
	public synchronized void get() {
		if(!state) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("用户拿到第"+this.milk+"瓶奶");
		state=false;
		notifyAll();
	}
}
