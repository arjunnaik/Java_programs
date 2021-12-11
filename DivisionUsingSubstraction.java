package my_project;

import java.util.Scanner;

public class DivisionUsingSubstraction {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1,num2,count=0,temp;
        System.out.println("Enter two integers");
        num1 = s.nextInt();
        num2 = s.nextInt();
        s.close();
        temp = num1;
        while (temp>0)
        {
        	
        	
        		temp-=num2;
        		count++;
        	
        }
        System.out.println(num1 + " / " + num2 + " = " + count);
 

	}

}
