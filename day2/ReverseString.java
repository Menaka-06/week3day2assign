package week3.day2;
public class ReverseString {

	public static void main(String[] args) {
	String name="MENAKA";
	char[] revName = name.toCharArray();
	for(int i= revName.length-1; i>=0;i--)
	{
		System.out.println(revName[i]);
	}
}

}
