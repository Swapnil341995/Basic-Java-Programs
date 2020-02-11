package Day1_13;

import java.util.Scanner;

public class Toys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,k;
	    System.out.println("Enter the no. of priced toys : ");
	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    System.out.println("Enter the amount Mark has to spend : ");
	    k=sc.nextInt();
	    int a[]={1,12,5,111,200,1000,10};
	    int b=0,count=0;
	    for(int i=0;i<=6;i++){
	        if(a[i]<50)
	        {
	            b+=a[i];
	            count++;
	        }
	    }
	    System.out.println(count);

	}

}
