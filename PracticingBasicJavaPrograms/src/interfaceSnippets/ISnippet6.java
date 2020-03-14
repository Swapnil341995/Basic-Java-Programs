package interfaceSnippets;

//interface A
//{											//Error 	Interface cannot have initializers
//	{
//		System.out.println("Interface A");
//	}
//	
//	static
//	{
//		System.out.println("Interface A");
//	}
//}



//		Q)	How will you access var i in interface?

//class P
//{
//	interface Q
//	{
//		int i = 111;
//	}
//}

//		A)	By P.Q.i



//interface ABCD
//{
//	public void methodOne();
//	
//	public void methodTwo();
//}
//
//interface PQR extends ABCD
//{
//	public void methodOne();
//	
//	public void methodTwo();			// Same methods can be declared in child interface
//}
//public class ISnippet6 implements PQR
//{
//
//	@Override
//	public void methodOne() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void methodTwo() {
//		// TODO Auto-generated method stub			// Same methods should be override and
													//thus program compiles successfully
//		
//	}
//	
//}
