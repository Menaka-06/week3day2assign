package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		String value1="madam";
		String value2="";
			
		System.out.println(value1);
		for (int i = value1.length()-1; i >=0 ; i--)
		{
			char revvalue = value1.charAt(i);
			value2+=revvalue;
			}
System.out.println(value2);
if(value1.equals(value2))
{
	System.out.println("yes it is a palindrome");
	}
	}
}

