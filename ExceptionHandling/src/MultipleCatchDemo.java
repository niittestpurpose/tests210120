import java.util.Scanner;

public class MultipleCatchDemo 
{
	public static void main(String arg[])
	{
		
		int arr[]= {2,3,0},num1=42,num2,result;
		
		Scanner scanner=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter the Value for Num2:");
			num2=scanner.nextInt();
			
			result=num1/arr[num2];
			
				//num2=0 => 42/arr[0]=>42/2 => 21 => There is no Error
				//num2=1 => 42/arr[1]=>42/3 => 14 => There is no Error
				//num2=2 => 42/arr[2]=>42/0 => Leads to ArithmeticException
				//num2=3 => 42/arr[3]=>Leads to ArrayIndexOutOfBoundsException
			
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Arised"+e);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Array Index Out Of Bounds Exception:"+ae);
		}
		catch(Exception e) //Global Exception
		{
			System.out.println("Exception Arised"+e);
		}
		
	}
}
