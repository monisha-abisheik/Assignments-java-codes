package admin;

import java.util.Scanner;

import view.Choice;

public class AdminLogin {
	

	private String adminid = "monisha";
	private String password = "moni@123";
	AddTrain train=new AddTrain();
	TrainList list=new TrainList();
	public void login() {
		Scanner input=new Scanner(System.in);
		boolean checkCondition;
		System.out.println("->Enter Loginid :");
		String adminMailId = input.next();
		System.out.println("->Enter password:");
		String adminPassword = input.next();
		if (adminid.equals(adminMailId) && adminPassword.equals(password)) {
			checkCondition = true;
			while (checkCondition) {

				System.out.println("Welcome Admin\n");
				System.out.println("1.Add Trains\n2.View Trains\n3.Back");
				int choice = input.nextInt();
				// c=false;
				switch (choice) {
				case 1: {
					train.join();
					break;
				}
				case 2: {
					list.viewTrainList();
					break;
				}

				
				case 3: {
					Choice option = new Choice();
					checkCondition = false;
					option.function();
					break;
				}

				}

			}
		} else
			System.out.println("Worng Credentials...!");

	}

	


}
