package Demo07;

public class ArgsDemo {

	public static void main(String[] args) {
		System.out.println(sum(1));
		System.out.println(sum(1,2,3,4));
		
	}
	public static int sum(int... a) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
}
