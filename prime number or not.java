import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int dig,i,j=0;
	    DataInputStream d=new DataInputStream(System.in);
	    dig=Integer.parseInt(d.readLine());
	    for(i=2 ; i<=dig/2 ; i++)
	    {
	        if(dig%i==0)
	       {
	           j=1;
	           break;
	       }
	    }
	    if(j==1)
	        System.out.print(dig+" is not a prime number");
	   else
	        System.out.print(dig+" is a prime number");
	}
}
