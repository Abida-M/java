import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int ini,ter,i,j=0;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.print("Enter starting range: ");
	     ini=Integer.parseInt(d.readLine());
	     System.out.print("Enter ending range: ");
	     ter=Integer.parseInt(d.readLine());
	    while(ini<ter)
	    {
            boolean flag = false;

            for( i = 2; i <= ini/2; ++i)                            //prime number condition
            {
                if(ini % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && ini != 0 && ini != 1)
                System.out.print(ini + " ");

            ini++;
	    }
	}
}
