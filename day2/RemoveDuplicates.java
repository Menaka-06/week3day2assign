package week3.day2;
public class RemoveDuplicates {
	public static void main(String[] args) 
	{
		String textval="We learn java basics as part of java sessions in java week1";
		String[] word=textval.split(" ");
		System.out.println(word);
		for (int i = 0; i < word.length; i++)
		{	if(word[i]!=null)	
			{	for (int j = i+1; j < word.length; j++) 
				{if(word[i].equals(word[j]))
					{word[j]=null;
					}
				}
			}
		}
	
	for(int k=0;k<word.length;k++)  
		  {if(word[k]!=null)
       {    	
    	 System.out.print(word[k]);
    		
    	} 
		 
       }
	
}
}
		
	
		

	


