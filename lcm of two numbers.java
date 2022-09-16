import java.io.*;
public class Main 
{
  public static void main(String[] args) throws IOException
  {
    int n1 , n2 , lcm;
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter first number: ");
    n1=Integer.parseInt(d.readLine());
    System.out.print("Enter second number: ");
    n2=Integer.parseInt(d.readLine());
    if(n1>n2)
        lcm=n1;
    else
        lcm=n2;
    for( ; ;lcm++)    //consider empty condition as true.
    {
      if(lcm%n1 == 0 && lcm%n2 == 0 ) 
      {
        System.out.printf("The LCM is "+lcm);
        break;
      }
    }
  }
}
