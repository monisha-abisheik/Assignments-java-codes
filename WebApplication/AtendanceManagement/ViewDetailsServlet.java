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


@WebServlet("/ViewDetailsServlet")
public class ViewDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String c_date=request.getParameter("date");
	PrintWriter pw=response.getWriter();
	try {
		pw.println("<html><body>");
		pw.println("<h3> Attendance Details</h3>");
		pw.println("<table border=1><tr>"  + "<td><b>Emp_ID</b></td>"
				+ "<td><b>Name</b></td>" );
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance", "root", "password");
		PreparedStatement ps = con.prepareStatement("select employee.Emp_ID,employee.Name from employee INNER JOIN attendance ON employee.emp_ID=attendance.emp_ID and c_Date=?;");	
		ps.setString(1, c_date);
		
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {

			pw.println("<tr>" + "<td>" + rs.getString(1) + "</td>" + "<td>" + rs.getString(2)  + "</td></tr>");

		}
		 pw.println("</table></body></html>");
	}
catch(Exception e) {
	System.out.println(e);
}
	
}
	
	

}
