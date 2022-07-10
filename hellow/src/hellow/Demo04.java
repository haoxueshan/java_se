package hellow;
//水仙花
public class Demo04 {
	public static void main(String[] args) {
		for(int i=100;i<1000;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			
			//判断将三位数中的每个数值取出，计算立方和后与原始数值比较是否相等
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai ==  i) {
				System.out.println(i);
			}
		}
	}

}
