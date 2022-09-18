/*
Armstrong Number:
    A number whose sum of cube of individual digits gives itself is called Armstrong number.
eg.,153
1^3+5^3+3^3=153
*/
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int n,m,copy,s=0;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter the Number: ");
	    n=Integer.parseInt(d.readLine());
	    copy=n;
	    while(n!=0)
	    {
	        m=n%10;
	        s=s+m*m*m;
	        n=n/10;
	    }
	    if(copy==s)
	        System.out.println(copy+" is an Armstrong Number");
	    else
	        System.out.println(copy+" is not an Armstrong Number");
	}
}
