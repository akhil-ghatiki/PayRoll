package ExceptionHandling;
class BelowMinimun extends Exception
{
	BelowMinimun(String message)
	{
		super(message);
	}
	
}

public class AccountException {
		private int balance;
		private String name;
		private String acn;
		private String asdfg;
		AccountException(String name1,String acn1)
		{
			name=name1;
			acn=acn1;
		}
		AccountException(String name2,String acn2,int balance2)
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
		private void withdraw(double amount)
		{
			System.out.println((double)balance-amount);
		}

public static void main(String[] args) {
			// TODO Auto-generated method stub
			AccountException a = new AccountException("Infor","123456");
			AccountException a1 = new AccountException("CSC", "562341",123456);
			a.getBalance();
			a1.getBalance();
			a.deposit(1000);
			a1.deposit(1023);
			a.withdraw(2000);
			a1.withdraw(5000);
			

		}

	}


	/*
	Encapsulation
	Improve the Account method above by properly encapsulating.
	*/

	