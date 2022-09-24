import java.io.*;
class Main
{
    public static void main(String[] args) throws IOException
    {
        int r,i,j;
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter no. of rows:");
        r=Integer.parseInt(d.readLine());
        for(i=r;((i<=r)&&(i!=0));i--)
        {
            for(j=1;j<=i;j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }
}
