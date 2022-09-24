import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    int r, i, k = 0;
    DataInputStream d = new DataInputStream (System.in);
    r = Integer.parseInt (d.readLine ());
    for (i = 1; i <= r; ++i, k = 0)
    {
	for (int space = 1; space <= r - i; ++space)
	  System.out.print ("  ");
	while (k != 2 * i - 1)
	{
	    System.out.print ("* ");
	    ++k;
	}
	System.out.println ();
  }
 }
}
