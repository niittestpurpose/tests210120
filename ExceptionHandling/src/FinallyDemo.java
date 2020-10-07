
public class FinallyDemo 
{
	public void display()
	{
		int num1=42,num2=2,result;
		
		try
		{
			result=num1/num2;
			System.out.println("Result:"+result);
			
			return;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("After the Exception");
	}
	
	public static void main(String arg[])
	{
		new FinallyDemo().display();
	}
}
