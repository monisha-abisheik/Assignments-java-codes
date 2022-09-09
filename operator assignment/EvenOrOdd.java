import java.util.*;
public class EvenOrOdd 
{
public static void main(String[] args)
{
		 int n;
		 Scanner s = new Scanner(System.in);  
			System.out.print("Enter the number: ");  
			n = s.nextInt();  
			s.close();
		 if ((n & 1)!=1)
		 {
			 
			 System.out.println(n+" is an Even Number");
		 }
		 
	        else
	        {    
	 System.out.println(n+"is a Odd Number");
	}
		 }
}
	
	
	
	
	
