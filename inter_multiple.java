import java.util.*;
 interface base
{
int addd(int a,int b);
}
 interface base1
{
int sub(int a,int b);
}
class inter_multiple implements base,base1
{
public int addd(int a,int b)
{
return(a+b);
}
public int sub(int a,int b)
{
return(a-b);
}
public static void main(String args[])
{
inter_multiple obj=new inter_multiple();
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int c=sc.nextInt();
int d=sc.nextInt();
System.out.println(obj.addd(c,d));
System.out.println(obj.sub(c,d));
}
}