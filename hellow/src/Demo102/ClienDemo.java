package Demo102;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.56.1",12345);
		
		OutputStream os=s.getOutputStream();
		os.write("hellow".getBytes());
		
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String data=new String(bys,0,len);
		System.out.println("¿Í»§¶Ë"+data);
		
		s.close();
		
	}
}
