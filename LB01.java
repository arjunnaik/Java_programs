package my_project;
import java.util.*;
import java.lang.*;
public class LB01 {
	
	public static void main(String[] args)
	{  Scanner sc=new Scanner(System.in);
	   int sent,recv,rate,rem=0,cap;
	   
	   System.out.println("Enter Bucket Capacity:");
	   cap=sc.nextInt();
	   System.out.println("Enter Bucket Leackage Rate:");
	   rate=sc.nextInt();
	   System.out.println("Enter Number Packets");
	   int n=sc.nextInt();
	   int a[]=new int[n+1];
	   System.out.println("Enter Packets");
	   for (int i=1; i<=n; i++)
	   {
		   a[i]=sc.nextInt();
	   }
	   System.out.println("CLOCK\tPACKET_SIZE\tACCEPT\tSENT\tREM");
	   for (int i=1; i<=n; i++)
	   {
		   if (a[i]!=0)
		   {
			   if (rem+a[i]>cap)
				   recv=-1;
			   else
			   {
				   recv=a[i];
				   rem+=a[i];
				}
		   }
		   else
			   recv=0;
		   if (rem!=0)
		   {
			   if (rem<rate)
			   {
				   sent=rem;
				   rem=0;
			   }
			   else
			   {
				   sent=rate;
				   rem-=rate;
			   }
		        
		   }
		   else
			   sent=0;
		   if (recv==-1)
		   {
			   System.out.println(i+"\t"+a[i]+"\t\t"+"dropped"+sent+"\t"+rem);
		   }
		   else
		   {
			   System.out.println(i+"\t"+a[i]+"\t\t"+recv+"\t"+sent+"\t"+rem);
		   }
		   
		   
	   }
	   
	   
	   
	   
		 
	}

}

