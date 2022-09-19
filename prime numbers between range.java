import java.io.*;
class prime{
    int i,j=0;
    void primeInRange(int ini,int ter)
	    {
	    while(ini<ter)
	    {
            boolean flag = false;

            for( i = 2; i <= ini/2; ++i)                           
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
	    prime ad=new prime();
	    ad.primeInRange(ini,ter);
	}
}
