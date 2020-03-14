package interfaceSnippets;

interface I11{
	void fun1();
}
interface I22{
	void fun2();
}
class fun12 implements I11,I22{

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		System.out.println("in fun2");
	}

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("in fun1");
	}
	public void fun3() {
		// TODO Auto-generated method stub
		System.out.println("in fun3");
	}
	
}
public class ISnippet12
{
	public static void main(String[] args) {
	I11 fu1 = new fun12();
	//I11 fu2 = new fun12();	--- gives error
	//I11 fu3 = new fun12();	--- gives error
	fu1.fun1();
	}
}
