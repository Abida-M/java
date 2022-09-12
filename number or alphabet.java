import java.io.*;
import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
        char i;                  //char can take Characterand numbers as input
	    Scanner d=new Scanner(System.in);
		System.out.print("Enter the Input: ");
		i=d.next().charAt(0); 
		 if((i>='a' && i<='z') || (i>='A' && i<='Z'))
            System.out.println(i +" is an Alphabet.");
        else
            System.out.println(i +" is a Number.");
    }
}
        
        
        
        
      
