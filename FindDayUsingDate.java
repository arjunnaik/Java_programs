package b1.student05;


import java.util.*;


class Result {


    public String findDay(int month, int day, int year) {
          int F,k=day,m,D=year%100,C=year/100;
         
           if(month==1)
               m=11;
           else if (month==2)
              m=12;
            else
               m=month-2;
  
        F=k+((13*m-1)/5)+D+(D/4)+(C/4)-2*C;
        System.out.println(F);
        if (F<0)
        {   F=(-1)*F;
        	for (int i=0; i<=7; i++)
        	{
        		int arjun = F/i;
        		if (arjun==0)
        		{
        			F=i;
        			break;
        		}
        	}
        }
        else
        {
        	F=F%7;
        }
         
        
        
        
          if (F==1) 
             return "MONDAY";
          else if (F==2) 
             return "TUESDAY";  
          else if (F==3) 
             return "WEDNESDAY";  
          else if (F==4) 
             return "THURSDAY";  
          else if (F==5) 
             return "FRIDAY"; 
          else if (F==6) 
             return "SATURDAY"; 
    
        	  
        	  return "SUNDAY";  


    }

}

public class Solution {
    public static void main(String[] args) {
     int m,d,y;
     Scanner sc = new Scanner(System.in);
     Result r = new Result();
     d = sc.nextInt();
     m = sc.nextInt();
     y = sc.nextInt();
     System.out.println(r.findDay(m, d, y));
     
    }
}