package Demo10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
//UDP���ݽ���
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(10086);
		
		byte[] by=new byte[1024];
		DatagramPacket dp=new DatagramPacket(by, by.length);
		ds.receive(dp);
		
		byte[] datas=dp.getData();
		int len=dp.getLength();
		String dataString =new String(datas,0,len);
		System.out.println("�����ǣ�"+dataString);
		
		ds.close();
	}
}
