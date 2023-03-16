package week3.day2;

public class FindCharCount {

	public static void main(String[] args) {
		int count=0;
		String inputval="TestLeaf";
		char[] inputcountval = inputval.toCharArray();
		for( int i=0; i<inputcountval.length; i++)
		{
			if(inputcountval[i]=='e')
			{
				count++;
			}
		}
		System.out.println("the count of e is "+count);

	}

}
