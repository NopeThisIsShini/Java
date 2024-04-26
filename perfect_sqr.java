import java.util.Scanner;
import java.lang.Math;
class perfect_sqr
{public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number: ");
  int a=sc.nextInt();
  double b= Math.sqrt(a);
  if(b*b == a)
    System.out.println(a+" is a perfect no");
  else
    System.out.println(a+"is a not perfect no");
 
 }
}
  