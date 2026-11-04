package constructor;

public class BankDeposit2 {
	
	String name;
	double balance;
	
	BankDeposit2(String _name,double _balance)
	{
		this.name=_name;
		this.balance=_balance;
	}
	
		void deposit(double x)
		{
			balance+=x;
		}
		
			void show()
			{
				System.out.println(name+"Balance = " +balance);
			}

			
}
