import java.util.*;
class area{
    public static int area(int a,int b)
    {
        return(a*b);
    }
    public static int area(int a)
    {
        return(a*a);
    }
    public static double area(double r)
    {
        return(3.14*r*r);
    }
    public static int peremeter(int a,int b)
    {
        return(2*(a+b));
    }
    public static int peremeter(int a)
    {
        return(4*a);
    }
    public static double peremeter(double r)
    {
        return(2*3.14*r);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sides of rectangular:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("peremeter of rectangular is:"+peremeter(a,b));
    System.out.println("area of rectangular is:"+area(a,b));
    System.out.println("Enter the side of square");
    int c=sc.nextInt();
    System.out.println("peremeter of square is:"+peremeter(c));
    System.out.println("Area of square is"+area(c));
    System.out.println("Enter the radious of circle:");
    double d=sc.nextDouble();
    System.out.println("Peremeter of circle"+peremeter(d));
    System.out.println("Area of circle"+area(d));
    }
    
}
