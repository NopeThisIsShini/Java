import java.util.*;
interface base
{
int add(int a,int b);
}
 class sub implements base
{
public int add(int a,int b)
{
return(a+b);
}
}
class sub1 extends sub
{
public int mul(int a,int b)
{
return(a*b);
}
}
public class inter_multilevel
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
sub1 obj2=new sub1();
System.out.println("result of addition is:"+obj2.add(a,b));
System.out.println("result of multiplication is:"+obj2.mul(a,b));
}
}