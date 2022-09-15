import java.io.*;
public class Main 
{
    public static void main(String[] args) throws IOException
    {
        int co,a;
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the Number: ");
        a=Integer.parseInt(d.readLine());
        for(co=0;a!=0;a/=10)
            co++;
        System.out.println(co);
    }
}
