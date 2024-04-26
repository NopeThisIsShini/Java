import java.util.*;
class cons_add
{
cons_add(int a,int b)
{
int x,y
x=a;
y=b;
int c=x+y;
System.out.println("sum="+c);
}
cons_add(int x,int y,int z)
{
int a,b,c;
a=x;
b=y;
c=z;
int d=a+b+c;
}
cons_add(double x,double y)
{
double a,b;
a=x;
b=y;
double c=a+b;
}
public static void main(String args[])
{
int a,b,c;
double d,e;
Scanner sc=new Scanner(System.in)
System.out.println("Enter two integer number");
a=sc.nextInt();
b=sc.nextInt();
b=sc.nextInt();
cons_add obj1=new cons_add(a,b);
cons_add obj1=new cons_add(a,b,c);
System.out.println("Enter two float number");
d=sc.double();
e=sc.double();
}
}