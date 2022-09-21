import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    long r;
    double ans=0;
    int i=0;
    DataInputStream d = new DataInputStream (System.in);
    System.out.println("Enter the number:");
    long a = Long.parseLong (d.readLine ());
    long p=a; 
    while(a!=0)
    {
        r=a%10;
        ans=ans+Math.pow(2,i);
        a=a/10;
    }
    System.out.println ("The decimal value of "+p+" is "+(int)ans);
  }
}
