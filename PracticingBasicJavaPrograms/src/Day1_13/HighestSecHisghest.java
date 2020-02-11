package Day1_13;

public class HighestSecHisghest {
	
	public static void main(String[] args) {
		
		int arr[] = {10,9,8,999,44,33,22,85,86,91,90,105,997,998,1,996};
		for(int i = 0;i<arr.length;i++) {
			System.out.println(""+i+" : "+arr[i]);
		}
		int largest = arr[0];
		int secLargest = arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secLargest) {
				secLargest=arr[i];
			}
		}
		System.out.println("largest is "+largest+" second largest is "+secLargest);
		
	}

}
