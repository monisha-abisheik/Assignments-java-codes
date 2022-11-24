package day7;

import java.util.Scanner;

public class TrainSeatNumber {


		static void findingSeatType(int seatNumber) {
			if (seatNumber % 8 == 1 || seatNumber % 8 == 4)
				System.out.println(seatNumber + "-" + "Lower Berth ");
			else if (seatNumber % 8 == 2 || seatNumber % 8 == 5)
				System.out.println(seatNumber + "-" + "Middle Berth ");
			else if (seatNumber % 8 == 3 || seatNumber % 8 == 6)
				System.out.println(seatNumber + "-" + "Upper Berth ");
			else if (seatNumber % 8 == 7)
				System.out.println(seatNumber + "-" + "Side Lower Berth ");
			else
				System.out.println(seatNumber + "-" + "Side Upper Berth ");

		}

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the seat number:");
			int seatNumber = input.nextInt();
			TrainSeatNumber.findingSeatType(seatNumber);

		}

	}


