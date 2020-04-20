package my_project;
import java.util.Scanner;
public class MinimumNumberOfCoins {
    public static void main(String arjun[])
    {
    	int i;
    	Scanner s = new Scanner(System.in);
    	i = s.nextInt();
    	while(i!=0)
    	{
    		if (i>=2000)
    		{
    			i=i-2000;
    			System.out.println("2000");
    		}
    		else if (i>=500)
    		{
    			i=i-500;
    			System.out.println("500");
    		}
    		else if (i>=200)
    		{
    			i=i-200;
    			System.out.println("200");
    		}
    		else if (i>=100)
    		{
    			i=i-100;
    			System.out.println("100");
    		}
    		else if (i>=50)
    		{
    			i-=50;
    			System.out.println("50");
    		}
    		else if (i>=20)
    		{
    			i-=20;
    			System.out.println("20");
    		}
    		else if (i>=10)
    		{
    			i-=10;
    			System.out.println("10");
    		}
    		else if (i>=5)
    		{
    			i-=5;
    			System.out.println("5");
    		}	
    		else if (i>=2)
    		{
    			i-=2;
    			System.out.println("2");
    		}
    		else if (i>=1)
    		{
    			i--;
    			System.out.println("1");
    		}
    	}
    }
	
}
