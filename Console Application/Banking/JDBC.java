package banking;

import java.sql.*;
	public class JDBC {
	    public static Connection jdbcConnection(){
	        try{
	        	return DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication","root","Monisha06");
	            
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return null;
	    }
	}

