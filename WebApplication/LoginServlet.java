package controller;

import java.io.IOException;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/UserLoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
		String password=request.getParameter("password");	
		HttpSession instance=request.getSession();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "password");
			PreparedStatement ps = con.prepareStatement("select emp_ID from employee where username=? and password=?");	
			ps.setString(1, uname);
			ps.setString(2, password);
			ResultSet rs= ps.executeQuery();
			
			
			if (rs.next() ) {
				int id=rs.getInt(1);
				instance.setAttribute("id",id);
				
				response.sendRedirect("Option.html");
			} else {
				response.sendRedirect("Login.html");

			}
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	

}
