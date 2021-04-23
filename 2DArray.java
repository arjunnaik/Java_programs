package b1.student05;
import java.util.*;
public class Check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       
	       int i,j,n = scan.nextInt();
	       int[][] arr = new int[n][];
	       for (i=0; i<n; i++)
	       {  int c = scan.nextInt();
	          arr[i] = new int[c];
	          for (j=0; j<c; j++)
	          {   
	              arr[i][j] = scan.nextInt();
	          }

	       }
	   
	       n = scan.nextInt();
	       for (i=0; i<n; i++)
	       {
	    	   int x = scan.nextInt();
	           int y = scan.nextInt();
	           System.out.println(arr[x][y]);
	       }
	}

}
