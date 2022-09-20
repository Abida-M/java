import java.io.*;

public class Main
{
  
 
public static void main (String[]args) throws IOException 
  {
    
int num;
     
DataInputStream d = new DataInputStream (System.in);
     
System.out.print ("Enter the number: ");
     
num = Integer.parseInt (d.readLine ());
     
int sum = addNumbers (num);
     
System.out.println ("Sum = " + sum);
   
} 

public static int addNumbers (int num)
  {
    
if (num != 0)
      
return num + addNumbers (num - 1);
    
    else
      
return num;
  
}

}
