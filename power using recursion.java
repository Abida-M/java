import java.io.*;
class Main
{
  public static void main(String[] args) throws IOException
  {
    int base,power;
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the base:");
    base=Integer.parseInt(d.readLine());
    System.out.print("Enter the power:");
    power=Integer.parseInt(d.readLine());
    int result = power(base, power);
    System.out.println("The value is " + result);
  }
  public static int power(int base, int power) 
  {
    if (power != 0) 
    {
        return (base * power(base, power - 1));
    }
    else 
      return 1;
  }
}
