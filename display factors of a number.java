import java.io.*;
public class Main
{
  public static void main (String[]args) throws IOException
  {
    int n,i;
    DataInputStream d = new DataInputStream (System.in);
    System.out.print ("Enter the Number: ");
    n = Integer.parseInt (d.readLine ());
    for(i=1;i<=n;i++)
    {                                  //factors are nothing but divisors
        if(n%i==0)
            System.out.print (i+" ");
    }
   }
}
