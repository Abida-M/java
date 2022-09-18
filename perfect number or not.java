/*
Perfect Number:
    The sum of the divisors of a number returns the number itself is called as perfect number
*/
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{   
	    int n,c,s=0;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter the number:");
	    n=Integer.parseInt(d.readLine());
	    for(c=1;c<n;c++)
	    {
	        if(n%c==0)
	        {
	            s=s+c;
	        }
	    }
	    if(s==n)
		    System.out.println("Perfect number");
		else
		    System.out.println("Not a Perfect number");
	}
}
