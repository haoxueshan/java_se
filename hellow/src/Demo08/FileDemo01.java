package Demo08;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) throws IOException {
		String dirname = "./java";
		File f1 = new File(dirname);
		if (f1.isDirectory()) {
			System.out.println("Directory of " + dirname);
			String s[] = f1.list();
			for (int i = 0; i < s.length; i++) {
				File f = new File(dirname + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " is a directory");
				} else {
					System.out.println(s[i] + " is a file");
				}
			}
		} else {
			System.out.println(dirname + " is not a directory");
		}
	}
}
