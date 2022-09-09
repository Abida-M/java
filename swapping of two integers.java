import java.io.*;
class Main
{
    public static void main(String []args)  throws IOException
    {  
        int i,j,k;
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the integer i:");
        i=Integer.parseInt(d.readLine());
        System.out.print("Enter the integer j:");
        j=Integer.parseInt(d.readLine());
        k=i;    //using an external variable k for swapping purpose
        i=j;
        j=k;
        System.out.println("After swapping:\nThe value of integer i is:"+i);
        System.out.print("The value if integer j is:"+j);
    }  
}
