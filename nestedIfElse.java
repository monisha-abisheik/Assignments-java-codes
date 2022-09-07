import java.util.Scanner;
public class nestedIfElse{    
public static void main(String[] args) {    
      
    int age;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter nationality");
    String citizen=sc.next();
    System.out.println("Enter the age");
    age=sc.nextInt();
    
    if(citizen=="indian") 
    {
        if(age>=18) 
        {
        	System.out.println("you are  eligible to apply  for voter id...");
        }
    
    else
    {
    	System.out.println("you are not eligible to apply for voter id");
    }
    }
    else
    {
    	System.out.println("you are not eligible to apply for voter id");
    
    }

    } 
}