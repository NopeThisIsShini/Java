import java.util.Scanner;
class arith
{public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the two numbers: ");
  float a=sc.nextFloat();
  float b=sc.nextFloat();
  System.out.println("Sum= "+(a+b));
  System.out.println("Difference= "+(a-b));
  System.out.println("Product= "+(a*b));
  System.out.println("Quotient= "+(a/b));
  System.out.println("Reminder= "+(a%b));
 }
}
  