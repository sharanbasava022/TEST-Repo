
public class Prime 
{

	public static void main(String[] args)
	{
		int num = 29;
		boolean bool =false;
		for(int i=2;i<=num/2;i++)
		{
			if(num % i == 0)
            {
                bool = true;
                break;
            }
		}
		
		
	}
}
