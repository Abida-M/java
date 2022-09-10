import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int year;
	    DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter the year:");
		year=Integer.parseInt(d.readLine());
		if((year%100 ==0) && (year%400 ==0))
		    System.out.println("It is Leap year");
		else if (year%4 ==0)
		    System.out.println("It is Leap year");
		else
		    System.out.println("It is not a Leap year");
		
	}
}
