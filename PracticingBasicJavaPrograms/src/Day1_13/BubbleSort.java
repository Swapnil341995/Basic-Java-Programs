package Day1_13;

public class BubbleSort {

	public static void main(String[] args) {

			int arr[] = {5,2,4,6,3,1};
			int n = arr.length;
			for(int i = 0;i<n;i++)
			{
				for(int j = 1;j<n;j++)
				{
					if(arr[j-1]>arr[j])
					{
						int temp = arr[j-1];
						arr[j-1]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i : arr) 
			{
				System.out.print(arr[i-1]);
			}
			
		
		}
	}

