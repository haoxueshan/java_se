package hellow;
//ˮ�ɻ�
public class Demo04 {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			
			//�жϽ���λ���е�ÿ����ֵȡ�������������ͺ���ԭʼ��ֵ�Ƚ��Ƿ����
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai ==  i) {
				System.out.println(i);
			}
		}
	}

}
