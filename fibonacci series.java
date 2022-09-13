import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException 
	
	{
	    int first,second,n,next,i;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter n: ");
	    n=Integer.parseInt(d.readLine());
	    first=0;
	    second=1;
	    System.out.println("Fibonacci series for "+n+" terms:");
	    for(i=0;i<=n;i++)
	    {
	        if(i==n)
	            System.out.print(first+" .");
	        else
	            System.out.print(first+",");
	        next=first+second;
	        first=second;
	        second=next;
	    }
	}
}
