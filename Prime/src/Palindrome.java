public class Palindrome 
{
	
	public static void main(String[] args)
	{
		
	
	String str ="MADAM";
	String reverse="";

	int length=str.length();

	for(int i=length-1;i>=0;i--)
	{
		reverse = reverse+str.charAt(i);
	}
	
	if(str.equals(reverse))
	{
		System.out.println("PALINDROME  ");
	}
	else
	{
		System.out.println("NOT PALINDROME");
	}
	
}
}	

