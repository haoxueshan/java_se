package Demo08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//??ȡ
		FileInputStream fis=new FileInputStream("./src/Demo08/?ֽ???.txt");
		//д??
		FileOutputStream fos=new FileOutputStream("./src/Demo08/fo.txt");
		
		int by;
		while((by=fis.read())!=-1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}

}
