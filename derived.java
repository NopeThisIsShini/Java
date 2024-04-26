import java.util.Scanner;
class single_inher
{  
    int a=20; 
}  
class derived extends single_inher
{  
 
 public static void main(String args[])
  {
   int b=30;  
   derived obj=new derived();  
   System.out.println("Sum of a and b ="+(b+obj.a));  
  }  
}  
