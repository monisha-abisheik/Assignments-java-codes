package user;


	
import java.util.ArrayList;

import java.util.Scanner;

import view.TicketChoice;


	
public class UserEntry {		 
		    
		   ArrayList <Passenger> train=new ArrayList <> ();
		   TicketChoice option=new TicketChoice();
		   public UserEntry()
		   {
			 train.add( new Passenger ("ananthi@gmail.com","Ananthi",(byte)21,"ananthi31"));
			 train.add(new Passenger ("moni@gmail.com","Monisha",(byte)22,"monisha@123"));
			 train.add(new Passenger ("madhu@gmail.com","Madhu",(byte)22,"madhi*12"));
			 train.add( new Passenger ("preethi@gmail.com","Preethi",(byte)22,"preethi#13"));
		   }
		   
		   
		    Scanner userInput=new Scanner(System.in);
		   
		  
		   
		    public void login(){
		        boolean checkIf =false;
		        String loginname="";
		     System.out.println("Enter Email :");
		          String mail=userInput.next();
		           System.out.println("Enter Password :");
		         String pass=userInput.next();
		         for(Passenger passenger : train  )
		         {
		         if (passenger.getMailid().equals(mail)&&passenger.getPassword().equals(pass))
		         {
		          loginname=passenger.getName();
		          checkIf=true;
		         }
		                
		         }
		         if(checkIf==true)
		         {
		          System.out.
		          println("Welcome "+loginname);
		          option.ticket();
		         }
		    
		         else
		         System.out.println("Username or password wrong!\n Re-enter password");
		         login();
		    }

			public void signUp() {
				 System.out.println("Enter Name :");
		          String name=userInput.next();
		          System.out.println("Enter Age :");
		          byte age=userInput.nextByte();
		          System.out.println("Enter Email :");
		          String mail=userInput.next();
		           System.out.println("Enter Password :");
		          String pass=userInput.next();
		          train.add(new Passenger(mail,name,age,pass));
		         System.out.println("Data added Successfully!");
		         System.out.println();
		          System.out.println("Welcome!"+name);
		          option.ticket();
				
			}




	}



