package numberProblems_81_100;

public class PrimesInRange {



		static boolean prime(int n)
		{
			if(n<2) 
				return false;
			
			for(int i=2;i*i<=n;i++)
				if(n%i==0) 
					return false;
			return true;
		}
		
		public static void main(String[] args) {
			for(int n=10;n<=20;n++)
				if(prime(n))
					System.out.println(n+" ");
		}
		
	

}
