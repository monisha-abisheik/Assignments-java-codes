package contactManagement;

import java.util.List;
import java.util.Scanner;

public class UpdateContact {
	private ContactList contacts;
	public void update() {
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the id:");
		int id =input.nextInt();
		System.out.println("Enter the name:");
		String name=input.next();
		System.out.println("enter the contact Number:");
		String contactNumber=input.next();
		
		
		contacts = new ContactList();
		 contacts.getList();

		
			for(Contact cont :  contacts.getList()) {
				
			    if(cont!=null && id==cont.getId()) {
			    	
			        cont.setName(name);
			        cont.setContactNumber(contactNumber);
			        System.out.println(cont);
			        break;
			    
			    }
			}
			}
		
}
