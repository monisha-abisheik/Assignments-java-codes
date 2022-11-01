package contactManagement;

import java.util.List;

public class ViewAllContact {
	private ContactList contacts;

	
	public void AllContact() {
		contacts = new ContactList();
		contacts.getList();
		
		for(Contact cont:contacts.getList()) {
			System.out.println(cont);
		}
		
	}

}
