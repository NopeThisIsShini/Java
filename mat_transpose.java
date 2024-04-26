import java.util.*;
class mat_transpose
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the row and column of matrix:");
int row=sc.nextInt();
int col=sc.nextInt();
int a[][]=new int[row][col];
mat_transpose obj=new mat_transpose();
obj.trans(a,row,col);
}
void trans(int a[][],int row,int col)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element of matrix:");
for(int i=0;i<row;i++)
for(int j=0;j<col;j++)
a[i][j]=sc.nextInt();

System.out.println("matrix is:");
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println(" Transpose matrix is:");
for(int i=0;i<col;i++)
{
for(int j=0;j<row;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println();
}
}
}