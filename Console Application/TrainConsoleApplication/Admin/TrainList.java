package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TrainList {
	

		Scanner getInput = new Scanner(System.in);

		public void viewTrainList() {
			PreparedStatement stmt = null;
			try {
				Connection jdbc=TrainDataBase.getInstance();

				stmt = jdbc.prepareStatement("select * from train");
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {

					System.out.println("TrainNo :" + rs.getInt("trainno") + "TrainName :" + rs.getString("train_name")
							+ "TrainFrom:" + rs.getString("train_from") + " TrainTo: " + rs.getString("train_to")
							+ "TicketCount: " + rs.getInt("ticket_count") + "TicketCost: " + rs.getString("ticket_cost"));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

}
