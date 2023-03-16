package week3.day2;

public class FindInterSection {

	public static void main(String[] args) {
		int[] arr1values = {3,2,11,4,6,7};
		int[] arr2values = {1,2,8,4,9,7};
		System.out.println("the same values are");
		for(int i=0; i<=arr1values.length-1; i++)
		{
			for(int j=0; j<=arr2values.length-1; j++)
			{
				if(arr1values[i]==arr2values[j])
				{
					int numvalue= arr1values[i];
					System.out.println(numvalue);
				}
			}
		}
	

	}

}
