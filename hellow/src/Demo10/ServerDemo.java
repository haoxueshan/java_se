package Demo10;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
//TCP���ݽ���
public class ServerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket ss=new ServerSocket(12345);
		
		Socket s=ss.accept();
		
		InputStream is=s.getInputStream();
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String data=new String(bys,0,len);
		
		System.out.println("�����ǣ�"+data);
		s.close();
		ss.close();
	}

}
