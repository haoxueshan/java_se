package Demo08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class objectOutputstreamDemo {

	public static void main(String[] args) throws  ClassNotFoundException, IOException, IOException {

		read();
	}
	public static void read() throws IOException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./src/Demo08/oos.txt"));
		Student s=new Student("??ɽ", 10);
		oos.writeObject(s);
		oos.close();
	}
	public static void write() throws IOException, IOException, ClassNotFoundException {
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./src/Demo08/oos.txt"));
		Object obj=ois.readObject();
		
		Student s=(Student) obj;
		System.out.println(s.getName()+s.getAge());
		ois.close();
		
	}
}
