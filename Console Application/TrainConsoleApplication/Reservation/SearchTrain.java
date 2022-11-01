package reservation;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import admin.TrainDataBase;
import admin.TrainDetails;


public class SearchTrain {
	BookTicket bookTicket=new BookTicket();
	public void search() {
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter From Location => : ");
		String trainfrom = userInput.next();
		System.out.println("Enter To  Location <= : ");
		String trainto = userInput.next();
		System.out.println("--------Available Trains------- ");

		System.out.println(
				"TrainNo    TrainName              From            To         TicketCount     Ticket Cost");
		try {
			
			Connection jdbc=TrainDataBase.getInstance();

			PreparedStatement ps = jdbc
					.prepareStatement("select * from train where train_from=? AND train_to=?");
			ps.setString(1, trainfrom);
			ps.setString(2, trainto);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {

				System.out.println(rs.getInt("trainno") + "    " + rs.getString("train_name") + "         "
						+ rs.getString("train_from") + "        " + rs.getString("train_to") + "           "
						+ rs.getInt("ticket_count") + "      " + rs.getString("ticket_cost"));
				System.out.println("---------------------------------------------------------");
			}
			
		System.out.println("select train number");
		int selectedtrain_No=userInput.nextInt();
		TrainDetails td = new TrainDetails();
		int num = td.setTrainno(selectedtrain_No);
		bookTicket.book(num);
			
		} catch (Exception e) {
			e.printStackTrace();

		}
		
	}

}
