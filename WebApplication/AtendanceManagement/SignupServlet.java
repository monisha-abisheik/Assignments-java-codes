package controller;

import java.io.IOException;


import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignupServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String password=request.getParameter("upwd");
		String eMail=request.getParameter("emailId");
VerifyEmail verify=new VerifyEmail();

boolean test=verify.emailVerification(eMail);

		PrintWriter out = response.getWriter();
		if(test) {
try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "password");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, Integer.parseInt(request.getParameter("employeeID")));
			ps.setString(2, request.getParameter("name"));
			ps.setString(3, request.getParameter("designation"));
			ps.setString(4,eMail );
			ps.setString(5, request.getParameter("mobile"));
			ps.setString(6, request.getParameter("dob"));
			ps.setString(7, request.getParameter("uname"));
			ps.setString(8, password);
			int count = ps.executeUpdate();
			if (count > 0) {
				out.println("Account added successfully.....");
			} else {
				out.println("Account not added ...");

			}
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}
	}
}
