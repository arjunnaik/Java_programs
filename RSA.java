package my_project;
import java.io.*;
import java.math.*;
import java.util.*;
public class RSA {
	private BigInteger p,q,N,e,d,phi;
	private int bitLength=1024;
	private Random r;
	public RSA()
	{
		r=new Random();
		p=BigInteger.probablePrime(bitLength,r);
		q=BigInteger.probablePrime(bitLength,r);
	    N=p.multiply(q);
	    phi=p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		e=BigInteger.probablePrime(bitLength/2,r);
		while(phi.gcd(e).compareTo(BigInteger.ONE)>0 && e.compareTo(phi)<0)
		{
			e.add(BigInteger.ONE);
			
		}
		d=e.modInverse(phi);
		
	}
		
		public static void main(String[] args) throws IOException
		{
			RSA rsa=new RSA();
			Scanner sc=new Scanner(System.in);
			String str;
			System.out.println("Enter a plain text: ");
			str=sc.nextLine();
			System.out.println("Encrypting String : " + str);
			System.out.println("String in Bytes: "+bytesToString(str.getBytes()));
			
			byte []encrypted=rsa.encrypt(str.getBytes());
			byte []decypted=rsa.decrypt(encrypted);
			System.out.println("encrypted String:"+bytesToString(decypted));
			System.out.println("decrpted string"+(new String(decypted)));
			
			
			
			
		}
		private static String bytesToString(byte[] by)
		{
			String test=" ";
			for (byte b:by)
			{
				test+=Byte.toString(b);
			}
			return test;
		}
		private byte[] encrypt(byte[] message)
		{
			return (new BigInteger(message)).modPow(e, N).toByteArray();
		}
		private byte[] decrypt(byte[] message)
		{
			return (new BigInteger(message)).modPow(d, N).toByteArray();
		}
	
	

}
