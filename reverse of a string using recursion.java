import java.util.*;
class Rev
{
   public static String reverse(String sentence) 
         {
            if (sentence.isEmpty())
                return sentence;
            else
                return reverse(sentence.substring(1)) + sentence.charAt(0);
        } 
}
class Main
{
    public static void main (String[] args)
    { 
        Scanner d=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String alp=d.nextLine();
        String rev="";
        int l=alp.length();
        rev=Rev.reverse(alp);
        System.out.print("The reverse of the string is "+rev);
    }
}
