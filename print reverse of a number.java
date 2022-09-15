import java.io.*;
public class Main 
{
  public static void main(String[] args) throws IOException
  {
    int num,rev,cal;
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the number: ");
    num=Integer.parseInt(d.readLine());
    System.out.print("Enter the Number: ");
    for(rev=0;num!=0;num/=10)
    {
      cal=num%10;
      rev=rev*10+cal;
    }
    System.out.println("The reverse of the number is "+rev);
  }
}
