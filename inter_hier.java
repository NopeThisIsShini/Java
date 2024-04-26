import java.util.*;
interface base
{
int op(int a,int b);
}
 class sub implements base
{
public int op(int a,int b)
{
return(a+b);
}
}
class sub1 implements base
{
public int op(int a,int b)
{
return(a-b);
}
}
public class inter_hier
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
sub obj=new sub();
sub1 obj2=new sub1();
System.out.println("result of addition is:"+obj.op(a,b));
System.out.println("result of substraction is:"+obj2.op(a,b));
}
}