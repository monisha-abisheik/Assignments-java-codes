package contactManagement;

import java.util.Scanner;

public class ContactManagement {

	public void process() {
	Scanner input=new Scanner(System.in);
	ContactList connect=new ContactList();
	ViewContact show=new ViewContact();
	UpdateContact alter=new UpdateContact();
    DeleteContact delete=new DeleteContact();
    ViewAllContact view=new ViewAllContact();    
int userInput;
 do {
System.out.println("********Contact Management********");
System.out.println("\n1.Add Contact\n2.View Contact\n3.Update Contact\n4.Delete Contact\n5.View All Contact\n6.Exit");
System.out.println("Enter your choice:");
 userInput=input.nextInt();
 
switch(userInput)
{
case 1:
	connect.addContact();
	break;
case 2:show.view();
	   break;
case 3:alter.update();
	   break;
case 4:delete.remove();
	   break;
case 5:view.AllContact();
       
	   break;
case 6:System.out.println("Thank you...");;
       break;
}


   
}while(userInput!=6);


}
	
	public static void main(String[] args) {
               ContactManagement contact=new ContactManagement();
               contact.process();
}
}
	


