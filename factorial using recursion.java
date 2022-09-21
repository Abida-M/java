import java.io.*;
class Fact
{
  static int facto (int n)
  {
    if (n >= 1)
      return n * facto (n - 1);
    else
      return 1;
  }
}
public class Main
{
  public static void main (String[]args) throws IOException
  {
    DataInputStream d = new DataInputStream (System.in);
    System.out.print ("Enter the value: ");
    int val = Integer.parseInt (d.readLine ());
    int m = Fact.facto (val);	// when we use static method ,it can be called by using class name
    System.out.println ("The factorial of " + val + " is " + m);
  }
}
