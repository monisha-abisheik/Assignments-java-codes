
import java.util.Scanner;
public class arrayMultiplication 
{
public static void main(String[] args)
	{
		        Scanner in=new Scanner(System.in);
		        System.out.println("enter the no of rows and columns of first array:");
		        int r1=in.nextInt();
		        int c1=in.nextInt();
		       int arr1[][]=new int [r1][c1];
		       System.out.println("enter the no of rows  and columns of second array:");
		        int r2=in.nextInt();
		        int c2=in.nextInt();
		        int arr2[][]=new int [r2][c2];
		         System.out.println("enter the elements of first array:");
		         for(int i=0;i<r1;i++)
		         {
		             for(int j=0;j<c1;j++)
		             {
		                 arr1[i][j]=in.nextInt();
		             }
		         }
		         System.out.println("enter the elements of second array:");
		         for(int i=0;i<r2;i++)
		         {
		             for(int j=0;j<c2;j++)
		             {
		                 arr2[i][j]=in.nextInt();
		             }
		         }
		             int ans[][]=new int [r1][c2];
		             System.out.println("multiplication of two arrays:");
		             int sum=0;
		             for(int i=0;i<r1;i++)
		             {
		                 for(int j=0;j<c2;j++)
		                 {   
		                     for(int p=0;p<c1;p++)
		                     {
		                         sum+=arr1[i][p]*arr2[p][i];
		                     }
		                   ans[i][j]=sum;
		                  System.out.print(ans[i][j]+" ");
		                  sum=0;
		                 }
		             }
		   
	}
}
		
	
