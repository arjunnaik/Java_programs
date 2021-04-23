package b1.student05;
class Fibonacci
{
	int fib1=0,fib2=1,fib3;
	
	int calcu(int n)
	{   
		if (n==0)
		{
			return fib1;
		}
		else if (n==1)
		{
			return fib2;
		}
		else
		{
			while(n>0)
			{
				fib3=fib1+fib2;
				fib1=fib2;
				fib2=fib3;
				n--;
			}
		}
		return fib3;
	}

}


public class Addition {

	public static void main(String[] args) {
		
		
		Fibonacci f = new Fibonacci();
		for (int i=0; i<=10; i++)
		{	int x=f.calcu(i);
		       System.out.println(x);
		}
		}
		
		
	}

