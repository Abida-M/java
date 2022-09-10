import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int a;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter the number:");
	    a=Integer.parseInt(d.readLine());
	    if (a>0)
	        System.out.println("Positive Number");
	    else
	        System.out.println("Negative Number");
	}
}
