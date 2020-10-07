public class Handled 
{
	public static void main(String arg[])
	{		
		int num1,num2,result;
		
		num1=42;
		num2=0;
		
		try
		{
		result=num1/num2;
		
		System.out.println("Result:"+result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Occured:"+ae);
		}
		
		System.out.println("====After the Exception====");
		
	}
}
