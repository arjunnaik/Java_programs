import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int v2000=0,v500=0,v200=0,v100=0,v50=0,v20=0,v10=0,v5=0,v2=0,v1=0;
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    System.out.println(n);
	    while(n!=0)
	    {
	        if(n-2000>=0){
	            v2000++;
	            n-=2000;
	        }else if(n-500>=0){
	            v500++;
	            n-=500;
	        }else if(n-200>=0){
	            v200++;
	            n-=200;
	        }else if(n-100>=0){
	            v100++;
	            n-=100;
	        }else if(n-50>=0){
	            v50++;
	            n-=50;
	        }else if(n-20>=0){
	            v20++;
	            n-=20;
	        }else if(n-10>=0){
	            v10++;
	            n-=10;
	        }else if(n-5>=0){
	            v5++;
	            n-=5;
	        }else if(n-2>=0){
	            v2++;
	            n-=2;
	        }else if(n-1>=0){

	            v1++;
	            n-=1;
	        }
	        
	      
	    }
	    System.out.println(v2000+" "+v500+" "+v200+" "+v100+" "+v50+" "+v20+" "+v10+" "+v5+" "+v2+" "+v1);

	}
}
