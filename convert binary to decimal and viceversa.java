import java.io.*;
class Oper
{
    public static void binaryToDecimal(long a)
    {
        long r;
        double ans=0;
        long p=a; 
        for(int i=0;a!=0;i++)
        {
            r=a%10;
            ans=ans+(r*Math.pow(2,i));
            a=a/10;
        }
        System.out.println ("The decimal value of "+p+" is "+(int)ans);
    }
    public static void decimalToBinary(int b)
    {
      System.out.println(Integer.toBinaryString(b)); 
    }
}
public class Main
{
  public static void main (String[]args) throws IOException
  {
    DataInputStream d = new DataInputStream (System.in);
    System.out.print("Enter the binary value:");
    long a = Long.parseLong (d.readLine ());
    Oper.binaryToDecimal(a);
    System.out.print("Enter the decimal: ");
    int b=Integer.parseInt(d.readLine());
    Oper.decimalToBinary(b);
   }
}
