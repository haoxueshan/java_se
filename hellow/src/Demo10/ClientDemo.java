package Demo10;
//TCPÊý¾Ý·¢ËÍ
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.56.1",12345);
		
		OutputStream os=s.getOutputStream();
		os.write("hellow".getBytes());
		s.close();
	}
}
