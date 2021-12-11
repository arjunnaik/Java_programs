package my_project;
import java.util.Scanner;
public class MultiplicationUsingRepeatedAddition {

	public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num1,num2,res=0,temp;
            System.out.println("Enter two integers");
            num1 = s.nextInt();
            num2 = s.nextInt();
            s.close();
            temp = num2;
            while (temp!=0)
            {
            	
            	
            		res+=num1;
            		temp--;
            	
            }
            
            System.out.println(num1 + " * " + num2 + " = " + res);
     }

}
