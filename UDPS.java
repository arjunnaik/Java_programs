package my_project;
import java.io.*;
import java.net.*;
public class UDPS
{
   public static void main(String[] args)
   {
	   try {
		    DatagramSocket ds = new DatagramSocket();
		    String str = "hello world";
		    InetAddress ia = InetAddress.getByName("127.0.0.1");
		    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ia, 3000);
		    ds.send(dp);
		    ds.close();
		  }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
	
 }
//ORRRRRRRR
import java.io.*;
import java.net.*;
public class UDPS
{
   public static void main(String[] args)
   {
	   try {
		   Socket s=new Socket("localhost",9999);
		   DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		   dout.writeUTF("Hi Kukdo");
		   dout.flush();
		   dout.close();
		   s.close();
		  }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
   }
	
}