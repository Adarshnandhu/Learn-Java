import java.util.*;
public class basic {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your name: ");
      String name = sc.nextLine();
      System.out.println("welcome "+name);
      System.out.print("Enter the first number: ");
      int a = sc.nextInt();
      System.out.print("Enter the second number: ");
      int b = sc.nextInt();
      System.out.println(a+b);
      System.out.print("Enter the price in float: ");
      float price = sc.nextFloat();
      System.out.print("Enter a double value: ");
      double value = sc.nextDouble();
      System.out.print(price+"\n"+value);
      sc.close();
    }
}
