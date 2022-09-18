import java.io.*;

public class Main{
    public static void main (String[] args)throws IOException 
    {
        int n,s=0;
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the Number:");
        n=Integer.parseInt(d.readLine());
        for(int i=1;i<n;i++)
        {
            if(i%2!=0)
                s=s+i;
        }
        System.out.print("The sum of odd number is "+s);
    }
}
