import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int i,n,fact;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter n: ");
	    n =Integer.parseInt(d.readLine());
	    fact=1;
	    for(i=1 ; i<=n ; i++)
	        fact*= i;
	    System.out.println("The factorial of "+n+" is "+fact);
	}
}
