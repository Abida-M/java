import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int a,b;
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the number");
		a=Integer.parseInt(d.readLine());
		if(a%2==0)
		    System.out.println(a+"is an even number");
		else
		    System.out.println(a+"is an odd number");
	}
}
