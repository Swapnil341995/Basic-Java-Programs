package Day1_13;

class A{
	
	
}

public class ConsChaining {
	static int a = 5;
	static int b =10;
	
	{
		System.out.println("inside init block A");
	}
	static {
		System.out.println("inside static block");
		//int a =5;
	}
	public ConsChaining() {
		System.out.println("inside constructor of A");
	}
	
	public static void main(String[] args) {
		
		ConsChaining c = new ConsChaining();
		System.out.println();
		System.out.println(a);
	}

}
