package Day1_13;

import java.util.Scanner;

class A1{
	public static void fun1(){System.out.println("A1 fun1");}
	public void fun2(){System.out.println("A1 fun2");}
}

public class Experiment extends A1{
	
	public static void fun1() {System.out.println("exp fun1");}

	public  void fun2() {System.out.println("exp fun1");}

	
    public static void main (String args[]){
    	A1 a = new A1();
    	a.fun1();
    	a.fun2();
    	A1 a1 = new Experiment();
    	a1.fun1();
    	a1.fun2();
    	A1 as = null;
    	System.out.println(as);
    	int m = 1;
    	int z = 000 + m;
    	System.out.println(z);
    	String k=String.format("%03d", z);
    	System.out.println(k);
    }  

}
