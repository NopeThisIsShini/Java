import java.util.*;
class Student{  
int a;
int b;
int add(int a,int b)
{
this.a=a;
this.b=b;
return(a+b);
}  
}    
class this1{  
public static void main(String args[]){  
Student s1=new Student();  
Student s2=new Student();  
s1.add(1,3);  
s2.add(2,5);
System.out.println("add="+s1.add(1,3));
System.out.println("add="+s2.add(2,5));  
}}  
