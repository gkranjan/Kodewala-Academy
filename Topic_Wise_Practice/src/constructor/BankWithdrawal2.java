package constructor;

public class BankWithdrawal2 {

	double balance;
	
	BankWithdrawal2(double _balance)
	{
		this.balance=_balance;
	}
	
		void Withdraw(double x)
		{
			if(x<=balance)
				balance -= x;
		}
			void show()
			{
				System.out.println("Balance = " +balance);
			}
}
