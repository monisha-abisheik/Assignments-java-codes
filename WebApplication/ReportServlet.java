package controller;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/ReportServlet")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ReportServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter pw = response.getWriter();
		String startDate = request.getParameter("date");
		String endDate = request.getParameter("date1");
		int id = (int) session.getAttribute("id");
		pw.println("<html><body>");
		pw.println("<h3>Employee Attendance Details</h3>");
		pw.print("<h2>Employee Id:" + id+"</h2>");
		pw.println("<table border=1><tr>"  + "<td><b>Date</b></td>"
				+ "<td><b>InTime</b></td>" + "<td><b>AttendanceStatus</b></td>");

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "password");
			PreparedStatement ps = con
					.prepareStatement("  SELECT * FROM attendance WHERE  c_DATE BETWEEN ? AND ? and  emp_ID in (?)");
			ps.setString(1, startDate);
			ps.setString(2, endDate);
			ps.setInt(3, id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				pw.println("<tr>" + "<td>" + rs.getString(2) + "</td>" + "<td>" + rs.getString(3) + "</td>" + "<td>"
						+ rs.getString(4) + "</td></tr>");

			}
			 pw.println("</table></body></html>");
			  
		} catch (Exception e) {
			System.out.println(e);

		}
	}

}
