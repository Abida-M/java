import java.io.*;
class Main
{
  public static void main(String[] args) throws IOException
  {
    int n,i,sum=0;
    int[] a=new int[50];
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the limit:");
    n=Integer.parseInt(d.readLine());
    for(i=0;i<n;i++)
        a[i]=Integer.parseInt(d.readLine());
    for(i=0;i<n;i++)
        sum+=a[i];
    float avg=sum/n;
    System.out.println("The average is " +avg);
  }
}
