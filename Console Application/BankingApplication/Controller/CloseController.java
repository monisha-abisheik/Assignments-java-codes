package controller;

import java.util.Scanner;

import model.AccountHolderDetails;
import view.ChoiceView;

public class CloseController {
	public void close()  {
		
		ChoiceView option=new ChoiceView();
		Scanner input=new Scanner(System.in);
		AccountHolderDetails accountHolder=new AccountHolderDetails();
		System.out.println("Do you want to continue..");
		System.out.println("1.Yes\t2.No");
		int userchoice = input.nextInt();
		if (userchoice  == 1) {
			option.choice();
		}else {System.out.println("Thank you for using our services!!!");}
		
	}

}
