import java.io.*;
public class Main 
{
  public static void main(String[] args) throws IOException
  {
    int num,pow,ans;
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the number: ");
    num=Integer.parseInt(d.readLine());
    System.out.print("Enter the exponent: ");
    pow=Integer.parseInt(d.readLine());
    for(ans=1;pow!=0;pow--)
        ans*=num;
    System.out.print("The value is "+ans);
  }
}
