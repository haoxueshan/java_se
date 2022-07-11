package Demo092;
//����
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
		System.out.println("���̹�����"+this.milk+"��������");
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
		System.out.println("�û��õ���"+this.milk+"ƿ��");
		state=false;
		notifyAll();
	}
}
