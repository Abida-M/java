import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int a,b,c;
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the three numbers one by one:\n");
		a=Integer.parseInt(d.readLine());
		b=Integer.parseInt(d.readLine());
		c=Integer.parseInt(d.readLine());
		if((a>b)&&(a>c))
		    System.out.println(a+" is the greatest number");
		else if ((b>c))
		    System.out.println(b+" is the greatest number");
		else
		    System.out.println(c+" is the greatest number");
	}
}
