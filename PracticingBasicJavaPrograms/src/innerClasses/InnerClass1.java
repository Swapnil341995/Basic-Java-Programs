package innerClasses;

public class InnerClass1 {
	int x = 12;
	static int y = 13;
	final int z = 14;
	
	class inner{
		public void m1() {
			InnerClass1 ic = new InnerClass1();
			System.out.println(ic.x);
			System.out.println(ic.y);
			System.out.println(ic.z);
		}
		public void main(String[] args) {
			inner i = new inner();
			//System.out.println(i.z);
		}
	}
	public static void main(String[] args) {
		InnerClass1 ic = new InnerClass1();
		System.out.println(ic.x);
		System.out.println(ic.y);
		System.out.println(ic.z);
	}
}
