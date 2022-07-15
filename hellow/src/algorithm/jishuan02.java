package algorithm;

import java.util.ArrayList;

public class jishuan02 {
	public static void main(String[] args) {
		String s="2*20+12-32+3+4-7+1";
//		ArrayList<?> str=new ArrayList<>();
//		String[] st=s.split("");
		
		int ss=MyEval(s);

		System.out.println(ss);
		
	}
	public static int MyEval(String str) {
		ArrayList<Integer> arrNum=new ArrayList<Integer>();
		ArrayList<String> arrOption=new ArrayList<String>();
		String option="+-*/";
		
		for(int i=0;i<str.length();i++) {
			if(option.indexOf(str.charAt(i))>=0) {
				arrOption.add(str.charAt(i)+"");
				continue;
			}
			for(int j=i;j<str.length();j++) {
				if(option.indexOf(str.charAt(j))>=0) {
					arrNum.add(Integer.parseInt(str.substring(i,j)));
					i=j-1;
					break;
				}
				if(j==str.length()-1) {
					arrNum.add(Integer.parseInt(str.substring(i)));
					i=j;
				}
			}
		}
//		System.out.println(arrOption);
		
		int count =arrNum.get(0);
		for(int i=0;i<arrNum.size()-1;i++) {
			if(arrOption.get(i).equals("+")) {
				count=count+arrNum.get(i+1);
			}else if(arrOption.get(i).equals("-")) {
				count=count-arrNum.get(i+1);
			}else if(arrOption.get(i).equals("*")) {
				count=count*arrNum.get(i+1);
			}else if(arrOption.get(i).equals("/")) {
				count=count/arrNum.get(i+1);
			}
//			System.out.println(count);
		}
		return count;
	}
}
