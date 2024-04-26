import java.util.Scanner;
class mat_add
{  
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of row for 1st matrix:");  
        int row1=sc.nextInt();
        System.out.print("Enter the no of col for 1st matrix:");  
        int col1=sc.nextInt();

        System.out.print("Enter the no of row for 2nd matrix:");  
        int row2=sc.nextInt();
        System.out.print("Enter the no of col for 2nd matrix:");  
        int col2=sc.nextInt();

        int a[][]=new int[row1][col1];
        int b[][]=new int[row2][col2];
        
        System.out.print("Enter the elements for 1st matrix :");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter the elements for 2nd matrix :");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        if(row1==row2 && col1==col2)    
        {
            int c[][]=new int[row1][col1];  //3 rows and 3 columns  
                
            for(int i=0;i<row1;i++)
            {    
                for(int j=0;j<col1;j++)
                {    
                    c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
                    System.out.print(c[i][j]+" ");    
                }    
            System.out.println();//new line    
            }    
        }
    }  
}