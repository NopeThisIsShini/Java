import java.util.Scanner;
class grade
{public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the marks: ");
  int a=sc.nextInt();
  if(a>90 && a<=100)
    System.out.println("Obtained grade: A");
  else if(a>70 && a<=90)
    System.out.println("Obtained grade: B");
  else if(a>=40 && a<=70)
    System.out.println("Obtained grade: C");
  else
    System.out.println("Obtained grade: D"); 
 }
}
  