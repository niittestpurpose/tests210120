import java.util.Scanner;

public class Bank 
{
	public void withDraw(int amount) throws MinimumBalanceException
	{
		int principalAmount=1000;
		
		if((principalAmount-amount)<500)
			throw new MinimumBalanceException();
		else
			System.out.println("Successful Transaction");
	}
	
	public static void main(String arg[])
	{
		
		Bank obj=new Bank();
		
		int amount;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Amount to Withdraw	:");
		amount=scanner.nextInt();
		
		try
		{
			obj.withDraw(amount);
		}
		catch(MinimumBalanceException mbe)
		{
			System.out.println("Exception Arised:"+mbe.getMessage());	
		}
		
	}
}
