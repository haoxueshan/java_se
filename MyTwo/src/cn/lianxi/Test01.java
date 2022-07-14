package cn.lianxi;
import java.util.ServiceLoader;

import demo01.Student;
import demo03.MyServer;
public class Test01 {

	public static void main(String[] args) {
		Student s=new Student();
		s.study();
		
		//Teache t=new Teache();
		ServiceLoader<MyServer> myserver=ServiceLoader.load(MyServer.class);
		for(MyServer my:myserver) {
			my.service();
		}
	}
}
