package ExceptionHandling;

public class ZeroBalance extends BalanceException
{
	ZeroBalance()
	{
		super();
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "there is zero balance";
	}
	

}
