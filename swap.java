import java.util.*;
class swap
{
public static void main(String args [])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a and b:");
a=sc.nextInt();
b=sc.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("a="+a);
System.out.println("b="+b);
}
}