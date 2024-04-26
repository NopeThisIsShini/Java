import java.util.Scanner;
class Constructor_Type {
    int a,b;
     Constructor_Type(){
         a = 0;
         b = 0;
         System.out.println("It is Default Constructor...");
         System.out.println("a = "+a+" b = "+b);
    }
    Constructor_Type(int x,int y){
         a = x;
         b = y;
         System.out.println("It is Parameterized Constructor...");
         System.out.println("a = "+a+" b = "+b);
    }
    

    public static void main(String[] args) {
        Constructor_Type obj1 = new Constructor_Type(); 
        Constructor_Type obj2 = new Constructor_Type(10,20); 
        
    }
}