import java.util.*;
class square
{
public static void main(String [] args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the square:");
a=sc.nextInt();
int b=(int)Math.sqrt(a);
if((b*b)==a)
System.out.println(a+"is the perfect square");
else
System.out.println(a+"is not a perfect square");
}
}