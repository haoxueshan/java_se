package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMassage {

	public static void main(String[] args) {
		
		ArrayList<Student> array=new ArrayList<Student>();
		while (true) {
			System.out.println("------学生管理系统-------");
			System.out.println("1 添加学生");
			System.out.println("2 删除学生");
			System.out.println("3 修改学生");
			System.out.println("4 查看所有学生信息");
			System.out.println("5 退出");
			System.out.println("输入你的选择");

			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();

			switch (line) {
				case "1":
					System.out.println("添加学生");
					addStudent(array);
					break;
				case "2":
					System.out.println("删除学生");
					delStudent(array);
					break;
				case "3":
//					System.out.println("修改学生");
					updateStudent(array);
					break;
				case "4":
					System.out.println("查看所有学生");
					findStudent(array);
					break;
				case "5":
					System.out.println("使用结束");
					//break;
					System.exit(0);
			}
		}
	}
	
	public static void addStudent(ArrayList<Student> array) {

		Scanner sc=new Scanner(System.in);
		System.out.println("请输入学号");
		String sid=sc.nextLine();
		System.out.println("请输入姓名");
		String name=sc.nextLine();
		System.out.println("请输入年龄");
		String age=sc.nextLine();
		System.out.println("请输入居住地址");
		String address=sc.nextLine();
		
		Student s=new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		array.add(s);
		System.out.println("信息添加成功");
		
		
	}

	public static void findStudent(ArrayList<Student> array) {
		if(array.size()==0) {
			System.out.println("请先添加信息");
			return;
		}
		System.out.println("学号\t姓名\t年龄\t居住地");
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}

	public static void delStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要删除的学生学号");
		String sid=sc.nextLine();
		int index=-1;
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			if(sid.equals(s.getSid())) {
				array.remove(i);				
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("没有这个学号");
		}else {
			System.out.println("删除学生成功");
		}

				
	}

	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要修改的学生学号");
		String sid=sc.nextLine();
		
		int index=-1;
		for(int i=0;i<array.size();i++) {
			Student stut=array.get(i);
			if(stut.getSid().equals(sid)) {
				
				index=i;
				break;
			}
		System.out.println("修改成功");
		}
		if(index==-1 || array.size()==0) {
			System.out.println("没有该学生");
		}else {
			System.out.println("请输入新姓名");
			String name=sc.nextLine();
			System.out.println("请输入新年龄");
			String age=sc.nextLine();
			System.out.println("请输入新居住地址");
			String address=sc.nextLine();
			
			Student s=new Student();
			s.setSid(sid);
			s.setName(name);
			s.setAge(age);
			s.setAddress(address);
			array.add(index,s);
		}
	}
}
