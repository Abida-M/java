import java.io.*;
class Oper
{
   public static void binaryToOctal(long bin)
   {
    int oct = 0, dec = 0, i = 0;
    while (bin != 0)
    {
      dec += (bin % 10) * Math.pow(2, i);
      ++i;
      bin /= 10;
    }
    i = 1;
    while (dec != 0)
    {
      oct += (dec % 8) * i;
      dec /= 8;
      i *= 10;
    }
    System.out.println("The octal value is "+oct);
  }
    public static void octalToBinary(int oct) 
    {
    int dec = 0, i = 0;
    long bin = 0;
    while (oct != 0)
    {
      dec += (oct % 10) * Math.pow(8, i);
      ++i;
      oct /= 10;
    }
    i = 1;
    while (dec != 0) 
    {
      bin += (dec % 2) * i;
      dec /= 2;
      i *= 10;
    }
    System.out.print("The binary value is "+bin);
    }
}
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter the binary value: ");
	    long a=Long.parseLong(d.readLine());
	    Oper.binaryToOctal(a);
	    System.out.print("Enter the octal value: ");
	    int b=Integer.parseInt(d.readLine());
	    Oper.octalToBinary(b);
	}
}
