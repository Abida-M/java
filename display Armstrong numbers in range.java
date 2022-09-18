/*
Armstrong Number:
    A number whose sum of cube of individual digits gives itself is called Armstrong number.
eg.,153
1^3+5^3+3^3=153
*/
import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    int s, t, copy;
    DataInputStream d = new DataInputStream (System.in);
    System.out.print ("Enter the First Number: ");
    s = Integer.parseInt (d.readLine ());
    System.out.print ("Enter the Second Number: ");
    t = Integer.parseInt (d.readLine ());
    for (int i = s; i < t; i++)
    {
	    int rem = 0, sum = 0;
	    copy = i;
	    while (copy != 0)
	    {
	      rem = copy % 10;
	      sum = sum + (rem * rem * rem);
	      copy = copy / 10;
	    }
	    if (sum == i)
	    {
	       System.out.print ( i + " ");
	    }
    }
  }
}
