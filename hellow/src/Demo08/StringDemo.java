package Demo08;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;



public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		String s="ÖÐ¹ú";
		byte[] bys=s.getBytes("Gbk");
		System.out.println(Arrays.toString(bys));
		
		String z=new String(bys,"Gbk");
		System.out.println(z);
	}

}
