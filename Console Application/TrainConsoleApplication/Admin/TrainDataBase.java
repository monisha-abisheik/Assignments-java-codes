package admin;


	import java.sql.*;



	public class TrainDataBase {			
		private static  Connection jdbc;
			
		   
			public static Connection getInstance()  {    
	            if(jdbc==null) { 
	            try {
	                   jdbc=DriverManager.getConnection("jdbc:mysql://localhost:3306/trainticketbooking","root","Monisha06");  
	                 } 
	          catch(Exception e) {
	        	  e.printStackTrace();}
	            }
	            return jdbc;
	}
}
		


