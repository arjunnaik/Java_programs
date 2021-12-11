package my_project;
import java.util.*;
public class BFA {

	public static void main(String[] args) {
	   int MAX_VAL=999;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Vertices");
		int n=sc.nextInt();
		int arr[][]=new int[n+1][n+1];
		
		System.out.println("Enter Adjacency Matrix");
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				arr[i][j]=sc.nextInt();
				if (i==j) {
					arr[i][j]=0;
					continue;}
				if (arr[i][j]==0)
				{
					arr[i][j]=MAX_VAL;
				}
				
			}
		}
		
	
		
		
		
		int D[]=new int[n+1];
		for (int i=1; i<=n; i++)
		{
			D[i]=MAX_VAL;
		}
		System.out.println("Enter the source vertex");
		int source=sc.nextInt();
		D[source]=0;
		for (int i=1; i<n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				for (int k=1; k<=n; k++)
				{
					if (arr[j][k]!=MAX_VAL)
					{
						if (D[k]>D[j]+arr[j][k])
						{
							D[k]=D[j]+arr[j][k];
						}
					}
				}
			}
		}
		boolean flag=true;
		for (int i=1; i<n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				for (int k=1; k<=n; k++)
				{
					if (arr[j][k]!=MAX_VAL)
					{
						if (D[k]>D[j]+arr[j][k])
						{
							flag=false;
							break;
						}
					}
				}
			}
		}
		if (flag)
		for (int i=1; i<=n; i++)
		{
			System.out.println("Distance from "+source+" to "+i+" is "+D[i]);
		}
		else
			System.out.println("Negative cycle");
		

	}

}
