import java.io.*;
//import java.util.*;
import java.lang.*;
class calculation
{
    int i,j,k,u;
void quotient()   
{ 
   k=i/j;
   System.out.println("The quotient is:"+k);
}  
void remainder()
{
    u=i%j;
    System.out.println("The remainder is:"+u);
}
void input() throws IOException
{ 
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the numerator:");
        i=Integer.parseInt(d.readLine());
        System.out.print("Enter the denomenator:");
        j=Integer.parseInt(d.readLine());
}
}
class Main
{
    public static void main(String []args)  throws IOException
    {  
        calculation f=new calculation(); 
        f.input();
        f.quotient();
        f.remainder();
    }  
}
