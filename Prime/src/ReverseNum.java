
public class ReverseNum 
{

	
	public static void main(String[] args)
    {
		int   num =1234;
	    int revers=0,remender = 0;
		
		while(num!=0)
		{
			remender= num%10;
			System.out.println(remender);
			revers = revers*10+remender;
			System.out.println(revers);
			num=num/10;
		}
		System.out.println("The reverse num is "+ revers);
		}
}
