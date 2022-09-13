import java.io.*;
public class Main
{
  public static void main (String[] args) throws IOException
  {
    int a, b, c;
    int k;
    DataInputStream d = new DataInputStream (System.in);
      a = Integer.parseInt (d.readLine ());
      b = Integer.parseInt (d.readLine ());
    for (c = 1; ((c <= a) && (c <= b)); c++)
      {
	if ((a % c == 0) && (b % c == 0))
	  k = c;
      }
    System.out.println ("The gcd of two Numbers is " + k);
  }
}
