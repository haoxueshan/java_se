package Demo08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallnameDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("./src/Demo08/µãÃûÆ÷.txt"));
		ArrayList<String> array=new ArrayList<String>();
		
		String line;
		while((line=br.readLine())!=null) {
			array.add(line);
		}
		br.close();
		Random r=new Random();
		int index=r.nextInt(array.size());
		String name=array.get(index);
		System.out.println(name);

	}

}
