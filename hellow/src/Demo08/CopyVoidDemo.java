package Demo08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyVoidDemo {

	public static void main(String[] args) throws IOException {
		long startTime=System.currentTimeMillis();
		method2();
		long endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
	//?ֽ???
	public static void methodl() throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("./src/Demo08/v1mp4");
		FileOutputStream fo=new FileOutputStream("./src/Demo08/v2.mp4");
		byte[] bys=new byte[1024];
		int len;
		while((len=fi.read())!=-1) {
			fo.write(bys,0,len);
		}
		fi.close();
		fo.close();
	}
	
	//?ֽڻ?????
	public static void method2() throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("./src/Demo08/v1.mp4"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("./src/Demo08/v2.mp4"));
		
		byte[] bys=new byte[1024];
		int len;
		while((len=bis.read())!=-1) {
			bos.write(bys,0,len);
		}
		bis.close();
		bos.close();
	}
	
}
