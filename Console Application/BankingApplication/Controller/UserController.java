package controller;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.AccountHolderDetails;
import view.BankDatabase;



public class UserController {
	Scanner input=new Scanner(System.in);
	
	
	public void login() throws SQLException {
		AccountHolderDetails accountHolder=new AccountHolderDetails();
		System.out.println("Enter the password");
		accountHolder.setPassword(input.next());

		try {
			Connection jdbc= BankDatabase.getInstance();

			PreparedStatement stmt =jdbc
					.prepareStatement("select * from accountdetails where username=? AND passWord=?");
			stmt.setString(1, accountHolder.getUserName());
			stmt.setString(2, accountHolder.getPassword());
			ResultSet rs = stmt.executeQuery();
			if (rs.next())
				System.out.println("Welcome " + accountHolder.getUserName());
			else
				System.out.println("Invalid user name and password");
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
			
		

	}

	public void enroll()  {
		AccountHolderDetails accountHolder=new AccountHolderDetails();

		System.out.println("Enetr the username: ");
		accountHolder.setUserName(input.next());
		System.out.println("Enter the password:");
		accountHolder.setPassword(input.next());
		System.out.println("Enter the  customername:");
		accountHolder.setCustomerName(input.next());

		System.out.println("Enter the mobile number:");
		accountHolder.setMobileNumber(input.next());
		System.out.println("Enter EmailId:");
		accountHolder.setEmailId(input.next());
		System.out.println("you are enroll successfully...");

		PreparedStatement stmt = null;
		try {
			Connection jdbc= BankDatabase.getInstance();

			stmt = jdbc.prepareStatement("insert into accountdetails values(?,?,?,?,?,?,?)");
			stmt.setString(1, accountHolder.getUserName());
			stmt.setString(2, accountHolder.getPassword());
			stmt.setString(3, accountHolder.getCustomerName());
			stmt.setLong(4, accountHolder.getAccountNumber());
			stmt.setString(5, accountHolder.getMobileNumber());
			stmt.setString(6, accountHolder.getEmailId());
			stmt.setLong(7, accountHolder.getBalance());
			stmt.setLong(7, 0);
			int i = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
		

}
