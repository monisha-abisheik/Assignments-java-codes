import java.util.Scanner;
public class nestedFor {

	public static void main(String[] args) {
		int n,i,s,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=n;i>=1;i--)
		{
			for(s=1;s<=n;s++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
