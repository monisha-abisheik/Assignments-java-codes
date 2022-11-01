package view;

import java.util.Scanner;

import reservation.BookTicket;
import reservation.SearchTrain;

public class TicketChoice {
	
	public void ticket() {
		Scanner input=new Scanner(System.in);
		BookTicket ticket=new BookTicket();
		SearchTrain searchTrain=new SearchTrain();
		boolean checkCondition=true;
		while (checkCondition) {
			System.out.println("\n1.BookTicket\n2.SearchTrain\n3.Back");
			int choice = input.nextInt();
			
			switch (choice) {
			case 1: {
				ticket.book();
				break;
			}
			case 2: {
				
				searchTrain.search();
							}

			case 3: {
				checkCondition = false;
				break;
			}

			}

		}
	}}

