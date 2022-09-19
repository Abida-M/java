import java.io.*;
class Arm
{
    void armstrongSeries(int s,int t)
    {
   for (int i = s; i < t; i++)
    {
	    int rem = 0, sum = 0;
	    int copy = i;
	    while (copy != 0)
	    {
	      rem = copy % 10;
	      sum = sum + (rem * rem * rem);
	      copy = copy / 10;
	    }
	    if (sum == i)
	    {
	       System.out.print ( i + " ");
	    }
    } 
}
}
public class Main
{
  public static void main (String[]args) throws IOException
  {
    int s, t;
    DataInputStream d = new DataInputStream (System.in);
    System.out.print ("Enter the First Number: ");
    s = Integer.parseInt (d.readLine ());
    System.out.print ("Enter the Second Number: ");
    t = Integer.parseInt (d.readLine ());
    Arm ng=new Arm();
    ng.armstrongSeries(s,t);
  }
}
