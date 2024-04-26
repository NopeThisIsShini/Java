import java.util.Scanner;
class cons_overload
{
    int x,y;
    cons_overload(int a,int b)
    {
        x=a+b;
        y=2;
    }
    cons_overload(int a,int b,int c)
    {
        x=a+b+c; 
        y=3;
    }
    cons_overload(int a,int b,int c,int d)
    {
        x=a+b+c+d; 
        y=4;
    }
    void display()
    {
        System.out.println("Sum of first"+y+" number is:"+x);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("a : ");
        int a= sc.nextInt();

        System.out.println("b : ");
        int b= sc.nextInt();

        System.out.println("c : ");
        int c= sc.nextInt();

        System.out.println("d : ");
        int d= sc.nextInt();

        cons_overload obj1= new cons_overload(a,b);
        cons_overload obj2= new cons_overload(a,b,c);
        cons_overload obj3= new cons_overload(a,b,c,d);
        obj1.display();
        obj2.display();
        obj3.display();
    }
    }