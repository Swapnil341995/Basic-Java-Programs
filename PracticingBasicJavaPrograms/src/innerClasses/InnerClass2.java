package innerClasses;

public class InnerClass2 {
	class Inner{
		public void m1() {
			System.out.println("in inner");
		}
	}
	public static void main(String[] args) {
		InnerClass2 ic = new InnerClass2();
		InnerClass2.Inner i = ic.new Inner();
		i.m1();
	}
}
