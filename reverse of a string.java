import java.util.*;
class Main
{
    public static void main (String[] args)
    { 
        Scanner d=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String alp=d.nextLine();
        String rev="";
        int l=alp.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=alp.charAt(i);
            rev=rev+ch;
        }
        System.out.print("The reverse of the string is "+rev);
    }
}
