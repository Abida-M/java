import java.io.*;
class Main {
  public static void main(String[] args)  throws IOException
  {
    int op;
    Double n1, n2, result;
    DataInputStream d = new DataInputStream(System.in);
    System.out.print("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\nChoose an operation:");
    op = Integer.parseInt(d.readLine());
    System.out.println("Enter first number");
    n1 = Double.parseDouble(d.readLine());
    System.out.println("Enter second number");
    n2 = Double.parseDouble(d.readLine());
    switch (op) {
      case 1:
        result = n1 + n2;
        System.out.println("The sum is " + result);
        break;
      case 2:
        result = n1 - n2;
        System.out.println("The difference is " + result);
        break;
      case 3:
        result = n1 * n2;
        System.out.println("The product is " + result);
        break;
      case 4:
        result = n1 / n2;
        System.out.println("The quotient is " + result);
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }
  }
}
