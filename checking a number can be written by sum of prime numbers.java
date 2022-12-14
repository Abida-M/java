import java.lang.*;
import java.io.*;

class PrimeAddition
{
    int checkPrime(int num) 
    {
        int Prime = 1;

        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            {
                Prime = 0;
                break;
            }
        }
        return Prime;
    }
}

public class Main
{
  public static void main(String[] args) throws IOException
  {
      PrimeAddition s=new PrimeAddition();
    
    DataInputStream d=new DataInputStream(System.in);
    System.out.println("Enter the Number:");
    int number=Integer.parseInt(d.readLine());
    int flag= 0;
    
    for (int i = 2; i <= number / 2; ++i) 
    {
      if (s.checkPrime(i)==1) 
      {
        if (s.checkPrime(number - i)==1)
        {
          System.out.printf("%d = %d + %d\n", number, i, number - i);
          flag = 1;
        }

      }
    }

    if (flag==0)
      System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
  }
}
