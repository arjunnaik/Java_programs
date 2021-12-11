package my_project;
import java.util.*;
import java.io.*;

public class CRC01 {
    public static void main(String[] args) throws Exception
    {


BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter number of data bit :");
int data_bits=Integer.parseInt(br.readLine());
System.out.println("Enter data bits:");
int data[]=new int[data_bits];
for(int i=0; i<data_bits; i++)
	data[i]=Integer.parseInt(br.readLine());


System.out.println("Enter the number of data bits in divisor:");
int divisor_bits=Integer.parseInt(br.readLine());
int divisor[]=new int[divisor_bits];
System.out.println("Enter divisor bits:");

for (int i=0; i<divisor_bits; i++)
	divisor[i]=Integer.parseInt(br.readLine());


int tot_length=data_bits+divisor_bits-1;
int temp[]=new int[tot_length];
System.out.print("\n\nDivident after appending "+(divisor_bits-1)+" 0's are : ");
for (int i=0; i<data_bits; i++)
{
	temp[i]=data[i];
}
for (int i=0; i<tot_length; i++)
{
	System.out.print(temp[i]+" ");
}
System.out.println();
 for (int i=0; i<data_bits; i++) { 
	 if (temp[i]==1) 
	 { for (int j=0; j<divisor_bits; j++) 
	    { 
		   temp[i+j]^=divisor[j]; 
		 } 
	 }
	 
  } 
 
 for (int i=0; i<data_bits; i++)
	{
		temp[i]=data[i];
		
	}
 System.out.print("\nCRC code:  ");
 for (int i=0; i<tot_length; i++) 
 { 
	 System.out.print(temp[i]+" "); 
 }
 System.out.println("\n\n\nEnter CRC code of "+tot_length+" bits to check error at receiver side...");
 int []temp1=new int[tot_length];
 
 
 for (int i=0; i<tot_length; i++)
     temp1[i]=Integer.parseInt(br.readLine());
 
 boolean check=true;
 
 
 for (int i=0; i<tot_length; i++)
 if (temp[i]!=temp1[i])
	 {check=false;
		 break;
	 }
	 
if (check==true)
System.out.println("Data is valid no error");
else
System.out.println("Data is invalid CRC error occured");

System.out.println("THANK YOU..........:)");

    }
}




