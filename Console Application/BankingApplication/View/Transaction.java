package view;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.*;
import controller.CloseController;
public class Transaction {
	
	
	CloseController end=new CloseController();
	AccountHolderDetails accountHolder=new AccountHolderDetails();
    Scanner input=new Scanner(System.in);
    

    
	public void deposit()  {
		
		System.out.println("Enter the amount:");
		int amt = input.nextInt();
		System.out.println("Enter theaccountNumber:");
		accountHolder.setAccountNumber(input.nextLong());
		accountHolder.setBalance(accountHolder.getBalance() + amt);
		try {
			Connection jdbc= BankDatabase.getInstance();

			PreparedStatement updateBal = jdbc
					.prepareStatement("update accountdetails set balance =balance+ ? where accountNumber=?");

			updateBal.setLong(1, accountHolder.getBalance());
			updateBal.setLong(2, accountHolder.getAccountNumber());
			int rs = updateBal.executeUpdate();
			PreparedStatement cs = jdbc
					.prepareStatement("select   balance from accountdetails where accountNumber=? ");
			
			cs.setLong(1, accountHolder.getAccountNumber());

			ResultSet result = cs.executeQuery();
			result.next();
			System.out.println("balance=" + result.getLong("balance"));
		} catch (Exception e) {
			e.printStackTrace();
		}
      end.close();
	}

	public void withdrawal() throws ClassNotFoundException, SQLException {
		AccountHolderDetails accountHolder=new AccountHolderDetails();
		System.out.println("Enter the Acconut Number:");
		accountHolder.setAccountNumber(input.nextLong());
		System.out.println("Enter the amount:");
		int amt = input.nextInt();
		try {
			
			Connection jdbc= BankDatabase.getInstance();

			PreparedStatement ps =jdbc
					.prepareStatement("select balance from accountDetails  where accountNumber=? ");
			ps.setLong(1, accountHolder.getAccountNumber());
			ResultSet rs = ps.executeQuery();
			rs.next();
			long balance = rs.getLong(1);
			if (balance > (amt + 1000)) {
				PreparedStatement ps1 = jdbc.prepareStatement(
						"update accountDetails set balance=balance-" + amt + " where accountNumber=?");
				ps1.setLong(1, accountHolder.getAccountNumber());
				int i = ps1.executeUpdate();
				PreparedStatement ps2 = jdbc
						.prepareStatement("select balance from accountDetails  where accountNumber=? ");
				ps2.setLong(1, accountHolder.getAccountNumber());
				ResultSet rs3 = ps2.executeQuery();
				rs3.next();
				System.out.println(
						amt + " is withdrawed from your account\n" + "\nbalance=" + rs3.getLong("balance"));

			} else {
				System.out.println("Insufficient balance...");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		end.close();
	}

	public void balanceEnquiry() throws ClassNotFoundException, SQLException {
		AccountHolderDetails accountHolder=new AccountHolderDetails();
		System.out.println("Enter the Acconut Number:");
		accountHolder.setAccountNumber(input.nextLong());
		try {
			
			Connection jdbc= BankDatabase.getInstance();

			PreparedStatement cs =jdbc
					.prepareStatement("select   balance from accountdetails where accountNumber=? ");
			
			cs.setLong(1, accountHolder.getAccountNumber());

			ResultSet result = cs.executeQuery();
			result.next();
			System.out.println("balance=" + result.getLong("balance"));
		} catch (Exception e) {
			e.printStackTrace();
		}
   end.close();
	}
	
}


