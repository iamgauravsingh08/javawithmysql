package phase2batch2;

import java.sql.SQLException;

public class jdbcoperation {
	
	public static final String DB_URL="jdbc:mysql://localhost:3306/employee";
	public static final String USERNAME="root";
	public static final String PASSWORD="12345";
	public static void main(String[]args)throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
	}  

}
