package view;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;


		public class BankDatabase{ 
			 private static  Connection jdbc;
			
		   
			public static Connection getInstance() throws SQLException {    
	            if (jdbc==null)  
	          {  try {
	                   jdbc=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication","root","Monisha06");  
	          } 
	          catch(Exception e) {
	        	  e.printStackTrace();}
	          }
	return jdbc;  
	}}
		




