import java.io.*;
class Gcd
{
  static int hcf(int a,int b)
  {
    if (b!=0)
      return hcf(b,a%b);
    else
      return a;
  }
}
public class Main
{
  public static void main (String[]args) throws IOException
  {
    DataInputStream d = new DataInputStream (System.in);
    System.out.println("Enter the numbers:");
    int a = Integer.parseInt (d.readLine ());
    int b = Integer.parseInt (d.readLine ());
    int m = Gcd.hcf (a,b);	
    System.out.println ("The gcd of " + a +" and "+b+" is " + m);
  }
}
