package work;
import java.util.*;

public class PatternRombhous {

	public static void main(String[] args) {
		Scanner inr = new Scanner(System.in);
		
	        // Add the necessary code in the below space
	      
         for (int l=1; l<=25; l++)
         {int i,j,k=l/2,m,z=0,y=l/2;
        	 
        	 if (l%2==0)
	             System.out.println("Invalid line number");
	       else 
	       {
	              for (i=0; i<l; i++)
	          {
	               if (i<(l/2+1))
	               {
	                  for (j=1; j<k+1; j++)  System.out.print(" ");
	                  for (m=0; m<=i; m++)     System.out.print("* ");
	                  k--;
	                      
	               }
	                else
	                {

	                  for (j=1; j<=z; j++)  System.out.print(" ");
	                  for (m=1; m<=y; m++)    System.out.print(" *");
	                  z++;
	                  y--;
	                }
	              System.out.println();
	   
	              }
	              
         }
	}

}
}	
