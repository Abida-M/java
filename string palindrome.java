import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    String str="mom", rev="";
	    int len=str.length();
	    for(int i=(len-1);i>=0;i--)
	        rev=rev+str.charAt(i);
	    if((str.toLowerCase()).equals(rev.toLowerCase()))
	        System.out.print(str+" is palindrome.");
	   else
	    System.out.print(str+" is not palindrome.");
	}
}
