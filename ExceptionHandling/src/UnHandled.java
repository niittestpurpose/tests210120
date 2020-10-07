public class UnHandled 
{
	public static void main(String arg[])
	{
		
		int num1,num2,result;
		
		num1=42;
		num2=0;
		
		result=num1/num2;//Program suspends here itself
		
		System.out.println("Result:"+result);
		
		System.out.println("====After the Exception====");
		
	}
}
