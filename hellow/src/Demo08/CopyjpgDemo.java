package Demo08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyjpgDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fi=new FileInputStream("./src/Demo08/1p.jpg");
		FileOutputStream fo=new FileOutputStream("./src/Demo08/2p.jpg");
		
		byte[] bys=new byte[1024];
		int len;
		while((len=fi.read())!=-1) {
			fo.write(bys,0,len);
		}
		
		
		fi.close();
		fo.close();
	}

}
