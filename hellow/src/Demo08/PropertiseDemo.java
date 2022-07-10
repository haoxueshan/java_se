package Demo08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiseDemo {

	public static void main(String[] args) throws Exception {
//		myStore();
		myLoad();
	}

	private static void myLoad() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileReader fr=new FileReader("./src/Demo08/fw.txt");
		prop.load(fr);
		fr.close();
		System.out.println(prop);
		
		
		
	}

	private static void myStore() throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		
		prop.setProperty("001", "����ϼ");
		prop.setProperty("002", "������");
		
		FileWriter fw=new FileWriter("./src/Demo08/fw.txt");
		prop.store(fw, null);
		fw.close();
	}
}
