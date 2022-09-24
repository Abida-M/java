import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException
	{
		int r,i,j;
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the number of rows:");
		r=Integer.parseInt(d.readLine());
		for(i=1;i<=r;i++)
		{
		    for(j=1;j<=i;j++)
		        System.out.print("* ");
		System.out.print("\n");
		}
	}
}
