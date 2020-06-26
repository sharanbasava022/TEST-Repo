
public  class MethOverRide 
{
	public void Calc()
	{
		System.out.println("Normal Calc");
		
	} 

	public static void main(String args[])
	{
		dummy obj = new dummy();
		obj.Calc();
	}
}