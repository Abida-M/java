//save file as Sha1Test.java
 import java.util.*;
import java.security.*;
class Sha1Test
{
public static void main(String[] a)
{
try
{
MessageDigest md=MessageDigest.getInstance("SHA1");
System.out.println("Message digest object info:");
System.out.println("Algorithm="+md.getAlgorithm());
System.out.println("Provider="+md.getProvider());
System.out.println("toString="+md.toString());
Scanner sc= new Scanner(System.in); 
System.out.print("Enter a string: ");  
String input= sc.nextLine();               
md.update(input.getBytes());
byte[] output=md.digest();
//System.out.println();
System.out.println("SHA1(\""+input+"\")=");
System.out.println(""+bytesToHex(output));
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
public static String bytesToHex(byte[] b)
{
char hexDigit[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'} ;
StringBuffer buf=new StringBuffer();
for(int j=0;j<b.length;j++)
{
buf.append(hexDigit[(b[j]>>4)&0x0f]);
buf.append(hexDigit[b[j]&0x0f]);
}
return buf.toString();
}
}      
