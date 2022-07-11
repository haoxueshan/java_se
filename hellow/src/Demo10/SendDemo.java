package Demo10;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
//UDP数据发送
public class SendDemo {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket();
		byte[] by="我来了".getBytes();
		int length=by.length;
		InetAddress address=InetAddress.getByName("192.168.56.1");
		int port=10086;
		DatagramPacket dp=new DatagramPacket(by, length,address,port);
		ds.send(dp);
		ds.close();
		
	}
}
