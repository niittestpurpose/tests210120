
public class MinimumBalanceException extends Exception 
{
	public MinimumBalanceException()
	{
		super("Balance is not Sufficient");
	}
	
	public String toString()
	{
		return "Balance is not Sufficient";
	}
}
