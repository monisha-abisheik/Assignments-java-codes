package banking;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Account {

	static String bankName = "ABC Bank";
	private String customerName;
	private long accountNumber;
	private String mobileNumber;
	private String emailId;
	private long balance;

	protected String userName;
	private String password;

	Scanner sc = new Scanner(System.in);
	/*private Object ans;
	private Object yes;
	private Object option;*/

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void authentication() throws SQLException, ClassNotFoundException {

		System.out.println("1.Login\n2.Enroll");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			login();
			choice();
			break;
		case 2:
			enroll();
			choice();
			break;

		}

	}

	public void login() throws SQLException {
		Account ac = new Account();
		System.out.println("Enter the username:");
		ac.setUserName(sc.next());
		System.out.println("Enter the password");
		ac.setPassword(sc.next());

		try {

			PreparedStatement stmt = JDBC.jdbcConnection()
					.prepareStatement("select * from accountdetails where username=? AND passWord=?");
			stmt.setLong(1, ac.accountNumber);
			stmt.setString(2, ac.password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next())
				System.out.println("Welcome " + ac.userName);
			else
				System.out.println("Invalid user name and password");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void enroll()  {
		Account ac = new Account();
		System.out.println("Enetr the username: ");
		ac.setUserName(sc.next());
		System.out.println("Enter the password:");
		ac.setPassword(sc.next());

		System.out.println("Enter the  customername:");
		ac.setCustomerName(sc.next());

		System.out.println("Enter the mobile number:");
		ac.setMobileNumber(sc.next());
		System.out.println("Enter EmailId:");
		ac.setEmailId(sc.next());
		System.out.println("you are enroll successfully...");

		PreparedStatement stmt = null;
		try {
			stmt = JDBC.jdbcConnection().prepareStatement("insert into accountdetails values(?,?,?,?,?,?,?)");
			stmt.setString(1, ac.userName);
			stmt.setString(2, ac.password);
			stmt.setString(3, ac.customerName);
			stmt.setLong(4, ac.accountNumber);
			stmt.setString(5, ac.mobileNumber);
			stmt.setString(6, ac.emailId);
			stmt.setLong(7, ac.balance);
			stmt.setLong(7, 0);
			int i = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void choice() throws SQLException, ClassNotFoundException {
		System.out.println("1.ShowAccount\n2.Deposit\n3.withdrawal\n4.BalanceEnquiry\n");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			showAccount();
			break;
		case 2:
			deposit();
			break;
		case 3:
			withdrawal() ;
			break;
		case 4:
			balanceEnquiry();
			break;
		}

	}
	public void close() throws ClassNotFoundException, SQLException {
		Account ac=new Account();
		System.out.println("Do you want to continue..");
		System.out.println("1.Yes\t2.No");
		int ch = sc.nextInt();
		if (ch == 1) {
			choice();
		}else {System.out.println("Thank you for using our services!!!");}
		
	}

	private void showAccount() throws SQLException, ClassNotFoundException {
		Account ac = new Account();
		System.out.println("Enter the accountNumbe:");
		ac.setAccountNumber(sc.nextLong());
		try {

			PreparedStatement cs = JDBC.jdbcConnection()
					.prepareStatement("select * from accountdetails where accountNumber=? ");
			cs.setLong(1, ac.accountNumber);
			ResultSet rs = cs.executeQuery();
			if (rs.next())
				System.out.println("CustomerName:" + rs.getString("CustomerName") + "\n" + "accountNumber:"
						+ rs.getLong("accountNumber") + "\n" + "MobileNumber:" + rs.getString("mobileNumber") + "\n"
						+ "EmailId:" + rs.getString("emailId") + "\n" + "Balance:" + rs.getLong("balance") + "\n");

		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	private void deposit() throws SQLException, ClassNotFoundException {
		Account ac = new Account();
		System.out.println("Enter the amount:");
		int amt = sc.nextInt();
		System.out.println("Enter theaccountNumber:");
		ac.setAccountNumber(sc.nextLong());
		ac.balance += amt;
		try {
			PreparedStatement updateBal = JDBC.jdbcConnection()
					.prepareStatement("update accountdetails set balance =balance+ ? where accountNumber=?");

			updateBal.setLong(1, ac.balance);
			updateBal.setLong(2, ac.accountNumber);
			int rs = updateBal.executeUpdate();
			PreparedStatement cs = JDBC.jdbcConnection()
					.prepareStatement("select   balance from accountdetails where accountNumber=? ");
			
			cs.setLong(1, ac.accountNumber);

			ResultSet result = cs.executeQuery();
			result.next();
			System.out.println("balance=" + result.getLong("balance"));
		} catch (Exception e) {
			e.printStackTrace();
		}
      close();
	}

	private void withdrawal() throws ClassNotFoundException, SQLException {
		Account ob = new Account();
		System.out.println("Enter the Acconut Number:");
		ob.setAccountNumber(sc.nextLong());
		System.out.println("Enter the amount:");
		int amt = sc.nextInt();
		try {
			PreparedStatement ps = JDBC.jdbcConnection()
					.prepareStatement("select balance from accountDetails  where accountNumber=? ");
			ps.setLong(1, ob.accountNumber);
			ResultSet rs = ps.executeQuery();
			rs.next();
			long balance = rs.getLong(1);
			if (balance > (amt + 1000)) {
				PreparedStatement ps1 = JDBC.jdbcConnection().prepareStatement(
						"update accountDetails set balance=balance-" + amt + " where accountNumber=?");
				ps1.setLong(1, ob.getAccountNumber());
				int i = ps1.executeUpdate();
				PreparedStatement ps2 = JDBC.jdbcConnection()
						.prepareStatement("select balance from accountDetails  where accountNumber=? ");
				ps2.setLong(1, ob.getAccountNumber());
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
		close();
	}

	private void balanceEnquiry() throws ClassNotFoundException, SQLException {
		Account ob = new Account();
		System.out.println("Enter the Acconut Number:");
		ob.setAccountNumber(sc.nextLong());
		try {
			PreparedStatement cs = JDBC.jdbcConnection()
					.prepareStatement("select   balance from accountdetails where accountNumber=? ");
			
			cs.setLong(1, ob.accountNumber);

			ResultSet result = cs.executeQuery();
			result.next();
			System.out.println("balance=" + result.getLong("balance"));
		} catch (Exception e) {
			e.printStackTrace();
		}
   close();
	}

}
