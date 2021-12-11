package my_project;
import java.io.*;
import java.net.*;

public class UDPC
{ public static void main(String args[])
	{
	try {
		 DatagramSocket ds = new DatagramSocket(3000);
		    byte[] buf = new byte[1024];
		    
		    DatagramPacket dp = new DatagramPacket(buf, 1024);
		    ds.receive(dp);
		    
		    String strRecv = new String(dp.getData(), 0, dp.getLength());
		    System.out.println(strRecv);
		    ds.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}


//ORRRRRRRRRRRRRRRRRRRRRRRRRR

import java.io.*;
import java.net.*;

public class UDPC
{ public static void main(String args[])
	{
	try {
		ServerSocket ss=new ServerSocket(9999);
		Socket s=ss.accept();
		DataInputStream din=new DataInputStream(s.getInputStream());
		String str=din.readUTF();
		System.out.println(str);
		ss.close();
		s.close();
		din.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	}
}


