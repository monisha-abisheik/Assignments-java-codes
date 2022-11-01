package view;

import java.sql.SQLException;
import java.util.Scanner;



public class ChoiceView {
	
	AccountDetails account=new AccountDetails();
	Transaction transfer=new Transaction();
	
	
	public void choice()   {
		Scanner input = new Scanner(System.in); 
		try {
			System.out.println("1.ShowAccount\n2.Deposit\n3.withdrawal\n4.BalanceEnquiry\n");
			int userchoice = input.nextInt();
			switch (userchoice) {
			case 1:
				account.showAccount();
				break;
			case 2:
				transfer.deposit();
				break;
			case 3:
				transfer.withdrawal() ;
				break;
			case 4:
				transfer.balanceEnquiry();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
