

public class q10 {
		public static void main(String[] args) {
			int i;
			for(i=50;i<100;i++)
			{
				if(isPrime(i))
					System.out.print(i+";");
			}
		}
		public static boolean isPrime(int n)
		{
			int i;
			if(n==1) return false;
			if(n==2) return true;
			for(i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0) return false;
			}
			return true;
		}
}
