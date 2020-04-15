package ImportantCodes;

//How do you find the missing number in a given integer array of 1 to 100?

public class MissingNumber {

	public static void main(String[] args) {

		//for now let us consider an array of integer from 1 to 10
		int arr[] = {1,2,3,7,8,9,4,5,10};//let us consider that 6 is missing
		int sum = 0;
		for(int i = 0;i < arr.length;i++) {
			
			sum += arr[i];
			
		}
		//for this code we will consider only one number is missing
		int total = ((arr.length+2)*(arr.length + 1))/2;
		System.out.println("The missing number is "+(total - sum));
		
	}

}
