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
import javax.servlet.http.HttpSession;

@WebServlet("/AttendanceServlet")
public class AttendanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AttendanceServlet() {
		super();

	}

	protected void doPost  (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		HttpSession session=request.getSession();
		
		int id=(int)session.getAttribute("id");
		String date = request.getParameter("date");
		String time=request.getParameter("time");
		String status = request.getParameter("option");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "password");
			PreparedStatement ps = con.prepareStatement("insert into attendance values(?,?,?,?)");
            ps.setInt(1, id);
			ps.setString(2, date);
			ps.setString(3, time);
			ps.setString(4, status);
			int count = ps.executeUpdate();
			if (count > 0) {
				out.println("Successfully check in...");
			} else {
				response.sendRedirect("Attendance.html");
			}

		} catch (Exception e) {
			System.out.println(e);

		}
	}
}
//var time=date.getHours()+":"+date.getMinutes();
//document.getElementById("time").value=time;