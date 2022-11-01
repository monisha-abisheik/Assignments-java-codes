package contactManagement;

import java.util.List;
import java.util.Scanner;

public class DeleteContact {

	public void remove() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=input.nextInt();
		ContactList contacts = new ContactList();
		  contacts.getList();
		
		 for(Contact co: contacts.getList()) {
	        if(co.getId()-1==id){
	        	 contacts.getList().remove(id);
	            break;			}
			}

			for(Contact co:  contacts.getList()) {
				System.out.println(co);
			     System.out.println("Contact removed successfully...");

	}
	}
}
