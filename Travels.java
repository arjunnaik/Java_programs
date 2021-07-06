public class Main
{
	public static void main(String[] args) {
	
	int n=6;
	int c=10;
	int x=0,y=0;
	for (int i=0; i<n; i++)
	{
	    if (i%5==0)
	    {
	     x=x+c;   
	    }else if(i%5==1)
	    {
	        y=y+c;
	    }else if(i%5==2)
	    {
	        x=x-c;
	    }else if(i%5==3)
	    {
	        y=y-c;
	    }
	    else if(i%5==4)
	    {
	      x=x+c;
	    }
	    
	    c=c+10;
	}
	System.out.println(x+" "+y);
	
	}
}
