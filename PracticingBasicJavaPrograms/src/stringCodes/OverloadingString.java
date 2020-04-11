package stringCodes;

class Test{
	public void fun(String a) {
		System.out.println("in string");
	}
	public void fun(StringBuffer a) {
		System.out.println("in stringbuffer");
	}
}

public class OverloadingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.fun(new StringBuffer("abc"));
	}

}
