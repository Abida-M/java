import java.io.*;
class Oper
{
    public static void octalToDecimal(long a)
    {
        long r;
        double ans=0;
        long p=a; 
        for(int i=0;a!=0;i++)
        {
            r=a%10;
            ans=ans+(r*Math.pow(8,i));
            a=a/10;
        }
        System.out.println ("The decimal value of "+p+" is "+(int)ans);
    }
    public static void decimalToOctal(int deci)
    {
      int oct = 0, i = 1;
      while (deci != 0)
      {
         oct += (deci % 8) * i;
         deci /= 8;
         i *= 10;
      }
      System.out.println ("The octal value of "+deci+" is "+oct);
    }
}
public class Main
{
  public static void main (String[]args) throws IOException
  {
    DataInputStream d = new DataInputStream (System.in);
    System.out.print("Enter the octal value:");
    long a = Long.parseLong (d.readLine ());
    Oper.octalToDecimal(a);
    System.out.print("Enter the decimal: ");
    int b=Integer.parseInt(d.readLine());
    Oper.decimalToOctal(b);
   }
}
