package week3.day2;
public class OddIndexToUpperCase 
{
	public static void main(String[] args)
	{
		  String word = "changeme";
		  String result="";
		  System.out.println(word.toUpperCase());
		  System.out.println(word);
		  for (int i = 0; i < word.length(); i++) 
		  {
		   char singlechar = word.charAt(i);
			if (i%2==0)
			{
			 result+=singlechar;
			}
			 else {
				 result += Character.toUpperCase(singlechar);
				}			
		}System.out.println(result);			
	}

}
