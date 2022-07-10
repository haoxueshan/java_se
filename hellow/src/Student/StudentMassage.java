package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMassage {

	public static void main(String[] args) {
		
		ArrayList<Student> array=new ArrayList<Student>();
		while (true) {
			System.out.println("------ѧ������ϵͳ-------");
			System.out.println("1 ����ѧ��");
			System.out.println("2 ɾ��ѧ��");
			System.out.println("3 �޸�ѧ��");
			System.out.println("4 �鿴����ѧ����Ϣ");
			System.out.println("5 �˳�");
			System.out.println("�������ѡ��");

			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();

			switch (line) {
				case "1":
					System.out.println("����ѧ��");
					addStudent(array);
					break;
				case "2":
					System.out.println("ɾ��ѧ��");
					delStudent(array);
					break;
				case "3":
//					System.out.println("�޸�ѧ��");
					updateStudent(array);
					break;
				case "4":
					System.out.println("�鿴����ѧ��");
					findStudent(array);
					break;
				case "5":
					System.out.println("ʹ�ý���");
					//break;
					System.exit(0);
			}
		}
	}
	
	public static void addStudent(ArrayList<Student> array) {

		Scanner sc=new Scanner(System.in);
		System.out.println("������ѧ��");
		String sid=sc.nextLine();
		System.out.println("����������");
		String name=sc.nextLine();
		System.out.println("����������");
		String age=sc.nextLine();
		System.out.println("�������ס��ַ");
		String address=sc.nextLine();
		
		Student s=new Student();
		s.setSid(sid);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		array.add(s);
		System.out.println("��Ϣ���ӳɹ�");
		
		
	}

	public static void findStudent(ArrayList<Student> array) {
		if(array.size()==0) {
			System.out.println("����������Ϣ");
			return;
		}
		System.out.println("ѧ��\t����\t����\t��ס��");
		for(int i=0;i<array.size();i++) {
			Student s=array.get(i);
			System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}

	public static void delStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ����ѧ��ѧ��");
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
			System.out.println("û�����ѧ��");
		}else {
			System.out.println("ɾ��ѧ���ɹ�");
		}

				
	}

	public static void updateStudent(ArrayList<Student> array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ѧ��ѧ��");
		String sid=sc.nextLine();
		
		int index=-1;
		for(int i=0;i<array.size();i++) {
			Student stut=array.get(i);
			if(stut.getSid().equals(sid)) {
				
				index=i;
				break;
			}
		System.out.println("�޸ĳɹ�");
		}
		if(index==-1 || array.size()==0) {
			System.out.println("û�и�ѧ��");
		}else {
			System.out.println("������������");
			String name=sc.nextLine();
			System.out.println("������������");
			String age=sc.nextLine();
			System.out.println("�������¾�ס��ַ");
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