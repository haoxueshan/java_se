package Demo04;

public class JumpDemo {

	public static void main(String[] args) {
		JumppingOperator ju=new JumppingOperator();
		Jumpping j=new Cat();
		ju.method(j);
		ju.method(new Jumpping() {
			
			@Override
			public void jump() {
				// TODO Auto-generated method stub
				System.out.println("狗可以调高了");
			}
		});
	}
}
