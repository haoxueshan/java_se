package Demo08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputstreamDemo01 {

	public static void main(String[] args) throws IOException {
//		FileOutputStream fo=new FileOutputStream("./src/Demo08/fo.txt",true);//true表示追加写入
//		fo.write("你好".getBytes());
//		fo.write("\n".getBytes());
//		fo.write("hellow".getBytes());
		
		FileInputStream fi=new FileInputStream("./src/Demo08/fo.txt");
//		int by=fi.read();
//		System.out.println(by);
//		System.out.println((char)by);
//		int by=fi.read();
//		while(by!=-1) {
//			System.out.print((char)by);
//			by=fi.read();
//		}
		int by;
		while((by=fi.read()) != -1) {
			System.out.print((char)by);
		}
		fi.close();
	}
}
