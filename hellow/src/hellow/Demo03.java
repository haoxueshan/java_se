package hellow;

public class Demo03 {
	public static void main(String[] args) {
		//������ֵ
		int height1=175;
		int height2=176;
		int height3=177;
		
		//��Ԫ��������÷�
		int tempheight=height1 > height2 ? height1:height2;
		int maxheight=tempheight > height3 ? tempheight:height3;
		System.out.println("���ֵ"+maxheight);
	}
}
