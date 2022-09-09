import java.io.*;
import java.util.*;
public class PrintAsciiValue   
{  
    public static void main(String []args)   
    {  
        Scanner d=new Scanner(System.in);
        System.out.print("Enter a character:");
        char first = d.next().charAt(0);  //getting input from user
        char second = 'z';  //compile time input
        int ascval1 = first;  
        int ascval2 = second;  
        System.out.println("The ASCII value of " + first + " is: " + ascval1);  
        System.out.println("The ASCII value of " + second + " is: " + ascval2);  
    }  
}  
