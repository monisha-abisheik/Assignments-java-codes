package contactManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactList {
		
		Scanner sc=new Scanner(System.in);
		List<Contact> contactlist=new ArrayList<Contact>();

	    Contact contact1=new Contact(1,"Monisha","8099090909","15-06-1998","monisha@gmail.com","peravurani");
	    Contact contact2=new Contact(2,"Ananthi","9080788991","02-11-1998","ananthi@gmail.com","pattukkottai");
	    Contact contact3=new Contact(3,"Madhu","9090980990","11-08-1997","madhu@gmail.com","thanjavur");
	    Contact contact4=new Contact(4,"Preethi","8890890900","28-04-1998","preethi@gmail.com","peravurani");
	    Contact contact5=new Contact(5,"Pavithra","9009944439","06-06-1998","pavithra@gmail.com","pattukkottai");
	    
	    
	   
	    	public  ContactList() {
	
	    	contactlist.add(contact1);
	    	contactlist.add(contact2);
	    	contactlist.add(contact3);
	    	contactlist.add(contact4);
	    	contactlist.add(contact5);
	    	}
	    	 public List<Contact> getList() {
	    	       return contactlist;
	    	   }
	    

	    public  void addContact() {
	    	
	    	Scanner input=new Scanner(System.in);
	    
	        	
	    	
	        	System.out.println("Enter the id:");
	        	int id=input.nextInt();
	        	System.out.println("Enter the name:");
	        	String name=input.next();
	        	System.out.println("Enter the contact Number:");
	        	String contactNumber=input.next();
	        	System.out.println("Enter the DOB:");
	        	String DOB=input.next();
	        	System.out.println("Enter the emailId:");
	        	String emailid=input.next();
	        	System.out.println("Enter the address:");
	        	String address=input.next();  
	        	System.out.println("Contact added successfully...");
	        	Contact c=new Contact(id,name,contactNumber,DOB,emailid,address);
	        	contactlist.add(c);
	        	  System.out.println(contactlist);  	
	        	}

	    }
    
	    

