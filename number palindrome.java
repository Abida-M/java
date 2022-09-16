import java.io.*;
public class Main 
{
  public static void main(String[] args) throws IOException
  {
    int num,rev,copy,mod;
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the number: ");
    num=Integer.parseInt(d.readLine());
    copy=num;
    for(rev=0;num!=0;num/=10)
    {
        mod=num%10;
        rev=rev*10 +mod;
    }
    if(rev==copy)
        System.out.print(copy+" is a palindrome number");
    else
        System.out.print(copy+" is not a palindrome number");     
  }
}
