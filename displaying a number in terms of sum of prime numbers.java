import java.io.*;
class Prime
{
    int i,n,flag=1;
    int isPrime(int n)                    //this function checks whethr the number is a prime or not
    {
       for(i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                flag=0;
                break;
            }
        }
        return flag;
    }
    void SumOfPrime(int n)   //checks whether the remaining number is also prime or not
    {
        flag=1;
        for(i=2;i<=n;i++)
        {
            if(isPrime(i)==1)
            {
                if(isPrime(n-i)==1)
                {
                    System.out.println(n+" can be written as "+i+"+"+(n-i));
                    flag=0;
                }
            }
        }
        if(flag==1)
            System.out.print("This number can not be written in terms of sum of prime numbers");
    }
}
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    int n;
	    DataInputStream d=new DataInputStream(System.in);
	    System.out.println("Enter the number:");
	    n=Integer.parseInt(d.readLine());
		Prime k=new Prime();
		k.SumOfPrime(n);
	}
}
