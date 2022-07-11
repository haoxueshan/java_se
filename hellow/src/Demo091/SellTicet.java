package Demo091;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicet implements Runnable {

	private int tickets = 1000000;
	private Object obj = new Object();
	private int x = 0;
	private Lock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			try {
				lock.lock();
				if (tickets > 0) {
					System.out.println(Thread.currentThread().getName() + "���ڳ���" + tickets + "��");
					tickets--;
				}else {
					break;
				}
			} finally {
				lock.unlock();
			}

		}
	}

	public synchronized void sellTicket() {
		while (true) {
			if (tickets > 0) {
				System.out.println(Thread.currentThread().getName() + "���ڳ���" + tickets + "��");
				tickets--;
			} else {
				break;
			}
		}
	}

}
