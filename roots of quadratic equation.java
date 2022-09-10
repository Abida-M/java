import java.io.*;
import java.lang.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		double a,b,c,x,r,i;
		double r1,r2;
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter a:");
		a=Double.parseDouble(d.readLine());
		System.out.print("Enter b:");
		b=Double.parseDouble(d.readLine());
		System.out.print("Enter c:");
		c=Double.parseDouble(d.readLine());
		x= (b*b)-(4*a*c);
		if(x>0)
		{
		    System.out.println("The roots are real and distinct");
		    r1= (-b+Math.sqrt(x))/(2*a);
            r2= (-b-Math.sqrt(x))/(2*a);
            System.out.println("The roots are "+r1+"and "+r2);
		}
		else if (x==0)
		{
		    System.out.println("The roots are real and equal");
		    r1= -b/(2*a);
            System.out.println("The roots are "+r1);
		}
		else if (x<0)
		{
		    System.out.println("The roots are imaginary");
		    r= -b/(2*a);
            i= Math.sqrt(-x)/(2*a);
            System.out.println("Root1="+r);
            System.out.println("Root2="+i+"i");
		}
    }
}
