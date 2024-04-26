import java.util.*;
interface subsum
{
int sum(int a,int b);
int sub(int a,int b);
}
interface muldiv
{
int mul(int a,int b);
int div(int a,int b);
}
class arithmetic implements subsum,muldiv
{
public int sum(int a,int b)
{ return(a+b);}
public int sub(int a,int b)
{return(a-b);}
public int mul(int a,int b)
{return(a*b);}
public int div(int a,int b)
{return(a/b);}

public static void main(String args[])
{
arithmetic obj=new arithmetic();
Scanner sc=new Scanner(System.in);
System.out.print("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
obj.sub(a,b);
obj.sum(a,b);
obj.mul(a,b);
obj.div(a,b);
System.out.println("Add="+obj.sum(a,b));
System.out.println("sub="+obj.sub(a,b));
System.out.println("mul="+obj.mul(a,b));
System.out.println("div="+obj.div(a,b));
}
}