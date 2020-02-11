package Day1_13;

import java.util.Scanner;

//wap to reverse a string with recursion
public class RevStr {
	
	public static void main(String args[]) {
		
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("recursion");
		System.out.println(RecursiveRevString(s));
		System.out.println("simple");
		String str = ReverseString(s);
		System.out.println(str);
		System.out.println("string builder");
		String abc = RevStr(s);
		System.out.println(abc);
		
	}
	
	public static String RecursiveRevString(String s) {
		
		if(s.length()==1)
			return s;
		return RecursiveRevString(s.substring(1))+s.charAt(0);
		
	}
	
	//without recursion
	public static String ReverseString(String s) {
		
		String reverse = "";
		for(int i = s.length()-1;i>=0;i--) {
			
			 reverse = reverse + s.charAt(i);
			
		}
		return reverse;
		
	}
	
	//using string builder
	public static String RevStr(String str) {
		
		
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
			
		}
		return sb.toString();//or directly we can use sb.reverse().tostring();
		
	}

}
