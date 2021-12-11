package my_project;

public class Prime {

	public static void main(String[] args) {
		int start=2,end=100000;
		int c=0;
		for (int i=start; i<=end; i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
				c++;
			}
		}
		System.out.println(c);
		

	}

	private static boolean isPrime(int n) {
		for (int i=2; i<=n/2; i++)
			if (n%i==0)
				return false;
		
		return true;
	}

}
