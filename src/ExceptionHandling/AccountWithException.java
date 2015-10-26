package ExceptionHandling;

public class AccountWithException {
	private int balance;
	private String name;
	private String acn;
	AccountWithException(String name1,String acn1)
	{
		name=name1;
		acn=acn1;
	}
	AccountWithException(String name2,String acn2,int balance2)
	{
		name=name2;
		acn=acn2;
		balance=balance2;
	}
	public void getBalance()
	{
		System.out.println(balance);
	}
	public void deposit(double amount)
	{
		System.out.println((double)balance+amount);
	}
	private void withdraw(double amount) throws BalanceException// MinimumBalance , ZeroBalance
	{
		if(((double)balance -amount)<0)
		{
			throw new MinimumBalance();
		}
		else if((double)balance - amount == 0)
		{
			throw new ZeroBalance();
		}
		else 
		{
		System.out.println((double)balance-amount);
		/*if(((double)balance - amount)<0 || ((double)balance - amount) == 0 )
		{
			throw new BalanceException();
		}*/
		}
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountWithException a = new AccountWithException("Infor","123456");
		AccountWithException a1 = new AccountWithException("CSC", "562341",123456);
		//MinimumBalance mb = new MinimumBalance("You cannot draw this amount");
		a.getBalance();
		a1.getBalance();
		a.deposit(1000);
		a1.deposit(1023);
		try{
		a1.withdraw(1234562);
		}
		catch(BalanceException b)
		{
			if(b instanceof MinimumBalance)
			   System.out.println(b.getMessage());
			else if (b instanceof ZeroBalance)
			   System.out.println(b.getMessage());	
		}
		/*catch(ZeroBalance z)
		{
			System.out.println(z.getMessage());
		}
		catch(MinimumBalance g)
		{
			System.out.println(g.getMessage());
		}*/
		
		
	//	a1.withdraw(5000);
		

	}

}


