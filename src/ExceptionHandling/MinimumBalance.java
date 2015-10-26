package ExceptionHandling;

public class MinimumBalance extends BalanceException {
	public MinimumBalance()
	{
	    super();
	}
public String getMessage() {
		// TODO Auto-generated method stub
		return "you cannot withdraw that amount";
	}

}
