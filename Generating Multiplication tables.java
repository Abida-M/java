import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException 
	
	{
	    int a,i,b,k;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter which table you want to print: ");
	    a=Integer.parseInt(d.readLine());
	    System.out.print("Enter how many line you want to print: ");
	    b=Integer.parseInt(d.readLine());
	    for(i=1 ; i<=b ; i++)
	    {
	        k=i*a;
		    System.out.println(a+" * "+i+" = "+k);
	    }
    }
}
