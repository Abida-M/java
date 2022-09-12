import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int n,s;
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter n: ");
		n =Integer.parseInt(d.readLine());
		s = ((n*n)+1)/2 ;
		System.out.println("The sum of "+n+" natural number is "+s);
	}
}
