package contactManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ContactDetails {
	
	Scanner sc=new Scanner(System.in);
	
	
	ArrayList<Contact> con=new ArrayList<Contact>();
    Contact con1=new Contact(1,"Monisha","8099090909","15-06-1998","monisha@gmail.com","peravurani");
    Contact con2=new Contact(2,"Ananthi","9080788991","02-11-1998","ananthi@gmail.com","pattukkottai");
    Contact con3=new Contact(3,"Madhu","9090980990","11-08-1997","madhu@gmail.com","thanjavur");
    Contact con4=new Contact(4,"Preethi","8890890900","28-04-1998","preethi@gmail.com","peravurani");
    Contact con5=new Contact(5,"Pavithra","9009944439","06-06-1998","pavithra@gmail.com","pattukkottai");
    
    
   
    	public  ContactDetails() {
    	con.add(con1);
    	con.add(con2);
    	con.add(con3);
    	con.add(con4);
    	con.add(con5);
    	}   	
    
    
    public void process() {
    	ContactDetails cd=new ContactDetails();
    int ch;
	 do {
	System.out.println("********Contact Management********");
	System.out.println("\n1.Add Contact\n2.View Contact\n3.Update Contact\n4.Delete Contact\n5.View All Contact\n6.Exit");
	System.out.println("Enter your choice:");
	 ch=sc.nextInt();
	 
	switch(ch)
	{
	case 1:
		cd.addContact();
		break;
	case 2:cd.viewContact();
    	   break;
	case 3:cd.updateContact();
		   break;
	case 4:cd.deleteContact();
    	   break;
	case 5:cd.viewAllContact();
	       
    	   break;
	case 6:cd.addContact();
           break;
	}
	
 
	   
}while(ch!=6);


}
    public void addContact() {
    	
    	System.out.println("Enter the id:");
    	int id=sc.nextInt();
    	System.out.println("Enter the name:");
    	String name=sc.next();
    	System.out.println("Enter the contact Number:");
    	String contactNumber=sc.next();
    	System.out.println("Enter the DOB:");
    	String DOB=sc.next();
    	System.out.println("Enter the emailId:");
    	String emailid=sc.next();
    	System.out.println("Enter the address:");
    	String address=sc.next();  
    	System.out.println("Contact added successfully...");
    	Contact c=new Contact(id,name,contactNumber,DOB,emailid,address);
    	con.add(c);
    	  System.out.println(con);  	
    	}
public void viewContact() 
{ 

	System.out.println("Enter the id:");
    int id=sc.nextInt();
    for(Contact co:con)
    {
    	if(co.getId()==id) 
    		System.out.println(co.getName()+"\n"+co.getContactNumber()+"\n"+co.getDOB()+"\n"+co.getEmailId()+"\n"+co.getAddress());
    		
    }
    }
public void updateContact() {
	
	System.out.println("Enter the id:");
	int id =sc.nextInt();
	System.out.println("Enter the name:");
	String name=sc.next();
	System.out.println("enter the contact Number:");
	String contactNumber=sc.next();
		for(Contact cont : con) {
			
		    if(cont!=null && id==cont.getId()) {
		    	
		        cont.setName(name);
		        cont.setContactNumber(contactNumber);
		        System.out.println(cont);
		        break;
		    
		    }
		}
		}
	
	

public void deleteContact() {
	System.out.println("Enter the id:");
	int id=sc.nextInt();
	 for(Contact co:con) {
        if(co.getId()==id){
            con.remove(id);
            break;
		}
		}
     System.out.println("Contact removed successfully...");

}
public void viewAllContact() {
	
	for(Contact cont:con) {
		System.out.println(cont);
	}
	
}


    
   
}