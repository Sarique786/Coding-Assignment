import java.util.*;
public class Pangram {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		System.out.println("Given Sentence = "+str);
		
		if(str.length()<26)		
		{
			System.out.println("\nGiven Sentence is not a Pangram");
		}
		else
		{
			String s= str.toLowerCase();	
			pangram(s);
		}
}
	public static void pangram(String s)
	{
		int count=0;

		for(char ch='a';ch<='z';ch++)
		{
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)==ch)
					{
						count++;
						break;	
					}
				}
			
		}
		if(count==26)
		{ 
			System.out.println("It's a pangram sentence");
		}
		else
		{
			System.out.println("\n It's not a pangram sentence");
		}	
	}
}