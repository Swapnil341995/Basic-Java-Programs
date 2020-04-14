package exceptionHandling;

public class ESnippet8 {
	
	public static void main(String []args) {
		try{String str = "null";
		Integer i = Integer.parseInt(str);
		System.out.println(i);
		}
		catch(NullPointerException npe){
			npe.printStackTrace();
		}
		System.out.println("end");
	}
	
}