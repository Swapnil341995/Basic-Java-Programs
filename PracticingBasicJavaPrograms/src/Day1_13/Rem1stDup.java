package Day1_13;


//remove 1st duplicate occurence in an array
public class Rem1stDup {
	
	public static void main(String []args) {
		
		System.out.println("remove 1st duplicate occurence in an array");
		int []x= {1,2,3,4,5,10,2,4};
		for(int i = 0;i<x.length;i++) {
			for(int j = i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println(x[i]);
					return;
				}
			}
		}
		
	}

}
