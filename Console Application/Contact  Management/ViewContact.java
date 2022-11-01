package contactManagement;

import java.util.List;
import java.util.Scanner;

public class ViewContact {
	   private ContactList contacts;
	
	
	
	
	public void view() 
	{ 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the id:");
	    int id=input.nextInt();
	    
		
		contacts = new ContactList();
		 contacts.getList();

		
	    for(Contact join:contacts.getList())
	    {
	    	if(join.getId()==id) 
	    		System.out.println(join.getName()+"\n"+join.getContactNumber()+"\n"+join.getDOB()+"\n"+join.getEmailId()+"\n"+join.getAddress());
	    		
	    }
	    }

}


