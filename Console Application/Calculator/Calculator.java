package consoleapplication;

import java.util.Scanner;

  public class Calculator {


    		public static void main(String[] args)
    		
    		 {
    			 Scanner sc=new Scanner(System.in);
    			 Calculation calculation=new Calculation();
    			  boolean b=true;
    			  while(b)
    			  {       
    			      System.out.println("----------------------------------");
    				    System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Sin\n6.Cos\n7.Tan\n8.Log\n9.SquareRoot\n10.CubeRoot\n11.Factorial\n12.Exit");
    				  System.out.println("----------------------------------");
    				  System.out.println("Enter the choice");
    				  int choice=sc.nextInt();
    				  switch(choice)
    				  {
    					  case 1:
    					  {
    						  calculation.addition();
    						  break;
    					  }
    					   case 2:
    					  {
    						   calculation.subraction();
    						  break;
    					  }
    					   case 3:
    					  {
    						   calculation.multiplication();
    						  break;
    					  }
    					   case 4:
    					  {
    						  calculation.division();
    						  break;
    					  }
    					   case 5:
    					  {
    						  calculation.sin();
    						  break;
    					  }
    					   case 6:
    					  {
    						  calculation.cos();
    						  break;
    					  }
    					   case 7:
    					  {
    						  calculation.tan();
    						  break;
    					  }
    					   case 8:
    					  {
    						  calculation.log();
    						  break;
    					  }
    					   case 9:
    					  {
    						  calculation.squareRoot();
    						  break;
    					  }
    					   case 10:
    					  {
    						  calculation.CubeRoot();
    						  break;
    					  }
    					  case 11:
    					  {
    						calculation.factorial();
    						break;
    					  }
    					  case 12:
    					  {
    					   b=false;
    					   System.out.println("Thankyou for using calculator");
    						  break;
    					  }
    					  default:
    					  {
    						 System.out.println("Please Enter Correct Choice...!");
    						 break;
    					  }
    					  
    				  }
    				  
    			  }
    		   }

    		}
